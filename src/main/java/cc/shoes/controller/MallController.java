package cc.shoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.shoes.common.ResponseResult;
import cc.shoes.entity.Mall;
import cc.shoes.entity.vo.MallVo;
import cc.shoes.service.MallService;
import cc.shoes.service.PictureService;

@RestController
@RequestMapping("/mall")
public class MallController {

	@Autowired
	private MallService mallService;
	@Autowired
	private PictureService pictureService;

	@PostMapping("/add")
	public ResponseResult addMall(Mall mall) {
		ResponseResult result = new ResponseResult();
		int addResult = mallService.addMall(mall);
//		if (1 == addResult) {
		result.setData(addResult);
		result.setCode(0);
		result.setMsg("添加成功");
//		} else {
//			result.setCode(2);
//			result.setMsg("添加失败");
//		}
		return result;
	}

	@PostMapping("/mallTable")
	public List<MallVo> findAllMalls() {
		System.out.println(111111);
		return mallService.findAllMalls();
	}
}
