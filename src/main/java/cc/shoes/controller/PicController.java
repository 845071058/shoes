package cc.shoes.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import cc.shoes.common.ResonseMsg;
import cc.shoes.common.ResponseCode;
import cc.shoes.common.ResponseResult;
import cc.shoes.service.PictureService;

@RestController
@RequestMapping("/pic")
public class PicController {
	@Autowired
	private PictureService pictureService;

	@PostMapping("/upload")
	public ResponseResult uploadPic(Integer mallId, HttpServletRequest request, @RequestParam MultipartFile[] PicArr) {
		ResponseResult result = new ResponseResult();
		boolean boo;
		try {
			boo = pictureService.addPicture(mallId, PicArr);
			if (boo) {
				result.setCode(ResponseCode.SUCCESS);
				result.setMsg(ResonseMsg.SUCCESS);
			} else {
				result.setCode(ResponseCode.ERROR);
				result.setMsg(ResonseMsg.ERROR);
			}
		} catch (Exception e) {
			result.setCode(ResponseCode.ERROR);
			result.setMsg(ResonseMsg.ERROR);
			e.printStackTrace();
		}
		return result;
	}
}
