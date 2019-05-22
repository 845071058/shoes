package cc.shoes.service;

import java.util.List;

import cc.shoes.entity.Mall;
import cc.shoes.entity.vo.MallCondition;
import cc.shoes.entity.vo.MallVo;

public interface MallService {

	int addMall(Mall mall);

	List<MallVo> findAllMalls();

	MallVo seleteMallDetail(Integer mallId);

	int updateMallToRecommend(Integer mallId);

	int updateMallToUnRecommend(Integer mallId);

	List<MallVo> findMallsForManager(MallCondition condition);

	boolean deleteMall(Integer mallId);

}
