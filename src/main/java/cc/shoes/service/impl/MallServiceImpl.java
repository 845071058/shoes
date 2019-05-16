package cc.shoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.shoes.entity.Mall;
import cc.shoes.entity.vo.MallVo;
import cc.shoes.mapper.MallMapper;
import cc.shoes.service.MallService;

@Service
public class MallServiceImpl implements MallService {

	@Autowired
	private MallMapper mallMapper;

//	@Autowired
//	private PictureMapper pictureMapper;

	public int addMall(Mall mall) {

		mallMapper.insert(mall);
		int mallId = mall.getMallid();
		return mallId;
	}

	public List<MallVo> findAllMalls() {
		return mallMapper.findAllMalls();
	}

}
