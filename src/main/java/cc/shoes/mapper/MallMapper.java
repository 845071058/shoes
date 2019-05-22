package cc.shoes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cc.shoes.entity.Mall;
import cc.shoes.entity.MallExample;
import cc.shoes.entity.vo.MallCondition;
import cc.shoes.entity.vo.MallVo;

public interface MallMapper {
	long countByExample(MallExample example);

	int deleteByExample(MallExample example);

	int deleteByPrimaryKey(Integer mallId);

	int insert(Mall record);

	int insertSelective(Mall record);

	List<Mall> selectByExample(MallExample example);

	Mall selectByPrimaryKey(Integer mallId);

	int updateByExampleSelective(@Param("record") Mall record, @Param("example") MallExample example);

	int updateByExample(@Param("record") Mall record, @Param("example") MallExample example);

	int updateByPrimaryKeySelective(Mall record);

	int updateByPrimaryKey(Mall record);

	List<MallVo> findAllMalls();

	List<MallVo> findMallsForManager();

	/**
	 * 后台条件查询
	 * 
	 * @param condition
	 * @return
	 */
	List<MallVo> findMallsByConditon(MallCondition condition);
}