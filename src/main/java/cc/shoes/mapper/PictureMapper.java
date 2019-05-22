package cc.shoes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cc.shoes.entity.Picture;
import cc.shoes.entity.PictureExample;

public interface PictureMapper {
	long countByExample(PictureExample example);

	int deleteByExample(PictureExample example);

	int deleteByPrimaryKey(Integer picid);

	int insert(Picture record);

	int insertSelective(Picture record);

	List<Picture> selectByExample(PictureExample example);

	Picture selectByPrimaryKey(Integer picid);

	int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

	int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

	int updateByPrimaryKeySelective(Picture record);

	int updateByPrimaryKey(Picture record);

	/**
	 * 查询轮播pic
	 * 
	 * @return
	 */
	List<Picture> selectRecommendMalls();

}