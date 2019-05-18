package cc.shoes.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import cc.shoes.common.ResponseResult;
import cc.shoes.service.PictureService;

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
		boolean boo;
		try {
			boo = pictureService.addPicture(mallId, PicArr);
			if (boo) {
				result.setCode(0);
				result.setMsg("OK");
			} else {
				result.setCode(1);
				result.setMsg("error");
			}
		} catch (Exception e) {
			result.setCode(1);
			result.setMsg("error");
			e.printStackTrace();
		}
		return result;
	}
}
