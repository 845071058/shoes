package cc.shoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.shoes.common.ResonseMsg;
import cc.shoes.common.ResponseCode;
import cc.shoes.common.ResponseResult;
import cc.shoes.entity.Mall;
import cc.shoes.entity.Picture;
import cc.shoes.entity.vo.MallCondition;
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
		result.setCode(ResponseCode.SUCCESS);
		result.setMsg(ResonseMsg.SUCCESS);
//		} else {
//			result.setCode(2);
//			result.setMsg("添加失败");
//		}
		return result;
	}

	/**
	 * 图片下拉列表
	 * 
	 * @return
	 */
	@PostMapping("/mallTable")
	public ResponseResult findAllMalls() {
		System.out.println(111111);
		ResponseResult result = new ResponseResult();
		List<MallVo> list = mallService.findAllMalls();
		if (null != list && list.size() > 0) {
			result.setCode(ResponseCode.SUCCESS);
			result.setData(list);
			result.setMsg(ResonseMsg.SUCCESS);
		} else {
			result.setCode(ResponseCode.ERROR);
			result.setMsg(ResonseMsg.NODATA);
		}
		return result;
	}

	/**
	 * 首页轮播图
	 * 
	 * @return
	 */
	@PostMapping("/recommendMalls")
	public ResponseResult findRecommendMalls() {
		ResponseResult result = new ResponseResult();
		List<Picture> list = pictureService.selectRecommendMalls();
		if (null != list && list.size() > 0) {
			result.setCode(ResponseCode.SUCCESS);
			result.setData(list);
			result.setMsg(ResonseMsg.SUCCESS);
		} else {
			result.setCode(ResponseCode.ERROR);
			result.setMsg(ResonseMsg.NODATA);
		}
		return result;
	}

	/**
	 * ToRecommend
	 * 
	 * @param mallId
	 * @return
	 */
	@PostMapping("/toRecommend")
	public ResponseResult toRecommend(Integer mallId) {
		ResponseResult result = new ResponseResult();
		int count = mallService.updateMallToRecommend(mallId);
		if (count == 1) {
			result.setCode(ResponseCode.SUCCESS);
			result.setMsg(ResonseMsg.SUCCESS);
		} else {
			result.setCode(ResponseCode.ERROR);
			result.setMsg(ResonseMsg.NODATA);
		}
		return result;

	}

	/**
	 * ToUnRecommend
	 * 
	 * @param mallId
	 * @return
	 */
	@PostMapping("/toUnRecommend")
	public ResponseResult toUnRecommend(Integer mallId) {
		ResponseResult result = new ResponseResult();
		int count = mallService.updateMallToUnRecommend(mallId);
		if (count == 1) {
			result.setCode(ResponseCode.SUCCESS);
			result.setMsg(ResonseMsg.SUCCESS);
		} else {
			result.setCode(ResponseCode.ERROR);
			result.setMsg(ResonseMsg.NODATA);
		}
		return result;
	}

	/**
	 * delMall
	 * 
	 * @param mallId
	 * @return
	 */
	@PostMapping("/delMall")
	public ResponseResult delMall(Integer mallId) {
		ResponseResult result = new ResponseResult();
		boolean b = mallService.deleteMall(mallId);
		if (b) {
			result.setCode(ResponseCode.SUCCESS);
			result.setMsg(ResonseMsg.SUCCESS);
		} else {
			result.setCode(ResponseCode.ERROR);
			result.setMsg(ResonseMsg.ERROR);
		}
		return result;
	}

	/**
	 * manager find malls by condition
	 * 
	 * @param condition
	 * @return
	 */
	@PostMapping("/findMalls")
	public ResponseResult findMalls(MallCondition condition) {
		ResponseResult result = new ResponseResult();
		List<MallVo> list = mallService.findMallsForManager(condition);
		result.setCode(ResponseCode.SUCCESS);
		result.setData(list);
		result.setMsg(ResonseMsg.SUCCESS);
		return result;
	}
}
