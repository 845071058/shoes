package cc.shoes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cc.shoes.entity.Mall;
import cc.shoes.entity.MallExample;
import cc.shoes.entity.vo.MallVo;

public interface MallMapper {
	long countByExample(MallExample example);

	int deleteByExample(MallExample example);

	int deleteByPrimaryKey(Integer mallid);

	int insert(Mall record);

	int insertSelective(Mall record);

	List<Mall> selectByExample(MallExample example);

	Mall selectByPrimaryKey(Integer mallid);

	int updateByExampleSelective(@Param("record") Mall record, @Param("example") MallExample example);

	int updateByExample(@Param("record") Mall record, @Param("example") MallExample example);

	int updateByPrimaryKeySelective(Mall record);

	int updateByPrimaryKey(Mall record);

	/**
	 * 后台管理系统查询所有商品
	 */
	List<MallVo> findAllMalls();
}