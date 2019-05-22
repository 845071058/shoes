package cc.shoes.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.shoes.entity.Mall;
import cc.shoes.entity.Picture;
import cc.shoes.entity.PictureExample;
import cc.shoes.entity.PictureExample.Criteria;
import cc.shoes.entity.vo.MallCondition;
import cc.shoes.entity.vo.MallVo;
import cc.shoes.mapper.MallMapper;
import cc.shoes.mapper.PictureMapper;
import cc.shoes.service.MallService;

@Service
public class MallServiceImpl implements MallService {

	@Autowired
	private MallMapper mallMapper;
	@Autowired
	private PictureMapper picMapper;

//	@Autowired
//	private PictureMapper pictureMapper;

	public int addMall(Mall mall) {

		mallMapper.insert(mall);
		int mallId = mall.getMallId();
		return mallId;
	}

	/**
	 * 下方列表
	 */
	public List<MallVo> findAllMalls() {
		return mallMapper.findAllMalls();
	}

	/**
	 * 详情页
	 */
	public MallVo seleteMallDetail(Integer mallId) {
		PictureExample example = new PictureExample();
		Criteria criteria = example.createCriteria();
		criteria.andMallidEqualTo(mallId);
		List<Picture> pics = picMapper.selectByExample(example);
		MallVo mallVo = (MallVo) mallMapper.selectByPrimaryKey(mallId);
		if (null != mallVo) {
			List<String> picPaths = new ArrayList<String>();
			if (pics.size() > 0) {
				for (Picture picture : pics) {
					picPaths.add(picture.getPicpath());
				}
			}
			mallVo.setPicPaths(picPaths);
		}
		return mallVo;
	}

	/**
	 * 改为Recommend
	 */
	public int updateMallToRecommend(Integer mallId) {
		Mall mall = mallMapper.selectByPrimaryKey(mallId);
		int result = 0;
		if (null != mall && mall.getIsRecommend() != 1) {
			mall.setIsRecommend(1);
			result = mallMapper.updateByPrimaryKey(mall);
		}
		return result;

	}

	/**
	 * 改为UnRecommend
	 */
	public int updateMallToUnRecommend(Integer mallId) {
		Mall mall = mallMapper.selectByPrimaryKey(mallId);
		int result = 0;
		if (null != mall && mall.getIsRecommend() == 1) {
			mall.setIsRecommend(2);
			result = mallMapper.updateByPrimaryKey(mall);
		}
		return result;
	}

	/**
	 * 此处可以修改 后台管理条件查询
	 */
	public List<MallVo> findMallsForManager(MallCondition condition) {
		if (null != condition) {
			return mallMapper.findMallsByConditon(condition);
		} else
			return mallMapper.findMallsForManager();
	}

	/**
	 * delmall
	 */
	public boolean deleteMall(Integer mallId) {
		PictureExample example = new PictureExample();
		Criteria criteria = example.createCriteria();
		criteria.andMallidEqualTo(mallId);
		mallMapper.deleteByPrimaryKey(mallId);
		picMapper.deleteByExample(example);
		return true;

	}

}
