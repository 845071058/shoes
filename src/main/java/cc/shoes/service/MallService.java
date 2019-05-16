package cc.shoes.service;

import java.util.List;

import cc.shoes.entity.Mall;
import cc.shoes.entity.vo.MallVo;

public interface MallService {

	int addMall(Mall mall);

	List<MallVo> findAllMalls();

}
