package cc.shoes.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import cc.shoes.entity.Picture;
import cc.shoes.mapper.PictureMapper;
import cc.shoes.service.PictureService;
import cc.shoes.util.FtpTool;
import cc.shoes.util.IDUtils;

@Service
public class PictureServiceImpl implements PictureService {
	@Value("${FTP.ADDRESS}")
	private String host;
	// 端口
	@Value("${FTP.PORT}")
	private String port;
	@Value("${FTP.USERNAME}")
	private String userName;
	@Value("${FTP.PASSWORD}")
	private String passWord;
	// 文件在服务器端保存的主目录
	@Value("${FTP.BASEPATH}")
	private String basePath;
	// 访问图片时的基础url
	@Value("${IMAGE.BASE.URL}")
	private String baseUrl;
	@Value("${IMA.WIDTH}")
	private int width;
	@Value("${IMA.HEIGHT}")
	private int height;

	@Autowired
	private PictureMapper picMapper;

	public boolean addPicture(int mallId, MultipartFile[] PicArr) throws Exception {

		try {
			int b = 0;
			int picLength = PicArr.length;
			for (int i = 0; i < picLength; i++) {
				MultipartFile uploadFile = PicArr[i];
				// 1.1获取原始文件名
				String oldName = uploadFile.getOriginalFilename();
				// 1.2使用IDUtils工具类生成新的文件名，新文件名 = newName + 文件后缀
				String imaSuffix = oldName.substring(oldName.lastIndexOf("."));
				String newName = IDUtils.genImageName();
				newName = newName + imaSuffix;
				String filePath = new DateTime().toString("yyyyMMdd");
				int porti = Integer.parseInt(port);
				String fileName = filePath + newName;
				InputStream input = FtpTool.resetWidAndHet(uploadFile, width, height, imaSuffix);
				Picture pic = new Picture();
				if (0 == i) {
					pic.setIsfirst(1);
				}
				pic.setCreatetime(new Date());
				pic.setMallid(mallId);
				pic.setPicpath(baseUrl + "/" + filePath + newName);
				pic.setUpdatetime(new Date());
				boolean boo = FtpTool.upload(host, porti, userName, passWord, basePath, input, fileName);
				if (boo) {
					picMapper.insert(pic);
					b++;
				}
			}
			if (b == picLength) {
				return true;
			} else {
				return true;
			}

		} catch (IOException e) {
			e.printStackTrace();
			return false;

		}
	}

	/**
	 * 首页轮播图
	 */
	public List<Picture> selectRecommendMalls() {
		return picMapper.selectRecommendMalls();
	}

}
