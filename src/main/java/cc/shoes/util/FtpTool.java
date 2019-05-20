package cc.shoes.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Administrator
 *
 */
public class FtpTool {

	// 用于打印日志
	private static final Logger log = Logger.getLogger(FtpTool.class);

	// 设置私有不能实例化
	private FtpTool() {

	}

	/**
	 * 上传
	 *
	 * @param hostname    ip或域名地址
	 * @param port        端口
	 * @param username    用户名
	 * @param password    密码
	 * @param workingPath 服务器的工作目
	 * @param inputStream 要上传文件的 输入流
	 * @param saveName    设置上传之后的文件名
	 * @return
	 */
	public static boolean upload(String hostname, int port, String username, String password, String workingPath,
			InputStream inputStream, String saveName) {
		boolean flag = false;
		FTPClient ftpClient = new FTPClient();
		// 1 测试连接
		if (connect(ftpClient, hostname, port, username, password)) {
			try {
				// 2 检查工作目录是否存在
				if (ftpClient.changeWorkingDirectory(workingPath)) {
					// 3 检查是否上传成功
					if (storeFile(ftpClient, saveName, inputStream)) {
						flag = true;
						disconnect(ftpClient);
					}
				}
			} catch (IOException e) {
				log.error("工作目录不存在");
				e.printStackTrace();
				disconnect(ftpClient);
			}
		}
		return flag;
	}

	/**
	 * 断开连接
	 *
	 * @param ftpClient
	 * @throws Exception
	 */
	public static void disconnect(FTPClient ftpClient) {
		if (ftpClient.isConnected()) {
			try {
				ftpClient.disconnect();
				log.error("已关闭连接");
			} catch (IOException e) {
				log.error("没有关闭连接");
				e.printStackTrace();
			}
		}
	}

	/**
	 * 测试是否能连接
	 *
	 * @param ftpClient
	 * @param hostname  ip或域名地址
	 * @param port      端口
	 * @param username  用户名
	 * @param password  密码
	 * @return 返回真则能连接
	 */
	public static boolean connect(FTPClient ftpClient, String hostname, int port, String username, String password) {
		boolean flag = false;
		try {
			// ftp初始化的一些参数
			ftpClient.connect(hostname, port);
			ftpClient.enterLocalPassiveMode();
			ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
			ftpClient.setControlEncoding("UTF-8");
			if (ftpClient.login(username, password)) {
				log.info("连接ftp成功");
				flag = true;
			} else {
				log.error("连接ftp失败，可能用户名或密码错误");
				try {
					disconnect(ftpClient);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			log.error("连接失败，可能ip或端口错误");
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * 上传文件
	 *
	 * @param ftpClient
	 * @param saveName        全路径。如/home/public/a.txt
	 * @param fileInputStream 要上传的文件流
	 * @return
	 */
	public static boolean storeFile(FTPClient ftpClient, String saveName, InputStream fileInputStream) {
		boolean flag = false;
		try {
			if (ftpClient.storeFile(saveName, fileInputStream)) {
				flag = true;
				log.error("上传成功");
				disconnect(ftpClient);
			}
		} catch (IOException e) {
			log.error("上传失败");
			disconnect(ftpClient);
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * @param 上传的文件
	 * @param width
	 * @param height
	 * @param 文件后缀
	 * @return
	 * @throws Exception
	 */
	public static InputStream resetWidAndHet(MultipartFile srcFile, int width, int height, String suffix)
			throws Exception {
		// 创建临时文件
		File temFile = File.createTempFile("fatherIma", suffix);
		FileUtils.copyInputStreamToFile(srcFile.getInputStream(), temFile);
		Image srcImg = ImageIO.read(temFile);
		BufferedImage buffImg = null;
		buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		// 使用TYPE_INT_RGB修改的图片会变色
		buffImg.getGraphics().drawImage(srcImg.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
		File file = File.createTempFile("tempFile", suffix);
		ImageIO.write(buffImg, StringUtils.substringAfter(suffix, "."), file);
		InputStream in = new FileInputStream(file);
		return in;
	}
}
