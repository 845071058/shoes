package cc.shoes.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import cc.shoes.common.ResponseResult;
import cc.shoes.entity.Picture;
import cc.shoes.service.PictureService;
import cc.shoes.util.FtpTool;
import cc.shoes.util.IDUtils;

@RestController
@RequestMapping("/pic")
public class PicController {
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
	@Autowired
	private PictureService pictureService;

	@PostMapping("/upload")
	public ResponseResult uploadPic(Integer mallId, HttpServletRequest request, @RequestParam MultipartFile[] PicArr) {
		ResponseResult result = new ResponseResult();
		try {
			int b = 0;
			int picLength = PicArr.length;
			for (int i = 0; i < picLength; i++) {
				MultipartFile uploadFile = PicArr[i];
				// 1.1获取原始文件名
				String oldName = uploadFile.getOriginalFilename();
				// 1.2使用IDUtils工具类生成新的文件名，新文件名 = newName + 文件后缀
				String newName = IDUtils.genImageName();
				newName = newName + oldName.substring(oldName.lastIndexOf("."));
				// 1.3生成文件在服务器端存储的子目录
				String filePath = new DateTime().toString("yyyyMMdd");
				System.out.println(host);
				System.out.println(port);
				int porti = Integer.parseInt(port);
				String fileName = filePath + newName;
				// 2、把前端输入信息，包括图片的url保存到数据库
				Picture pic = new Picture();
				if (0 == i) {
					pic.setIsfirst(1);
				}
				/**
				 * 对数据库操作要写到service层去
				 */
				pic.setCreatetime(new Date());
				pic.setMallid(mallId);
				pic.setPicpath(baseUrl + "/" + filePath + newName);
				pic.setUpdatetime(new Date());
				pictureService.addPicture(pic);
				// 3、把图片上传到图片服务器
				// 3.1获取上传的io流
				InputStream input = uploadFile.getInputStream();
				// 3.2调用FtpUtil工具类进行上传
				boolean boo = FtpTool.upload(host, porti, userName, passWord, basePath, input, fileName);
				if (boo) {
					b++;
				}
			}
			if (b == picLength) {
				result.setCode(0);
				result.setMsg("Ok");
			} else {
				result.setCode(1);
				result.setMsg("Error");
			}

		} catch (IOException e) {
			result.setCode(1);
			result.setMsg("Error");
			e.printStackTrace();
		}
		return result;
	}
}
