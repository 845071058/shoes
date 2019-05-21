package cc.shoes.mapper;

import cc.shoes.entity.MallCart;
import cc.shoes.entity.MallCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallCartMapper {
    long countByExample(MallCartExample example);

    int deleteByExample(MallCartExample example);

    int deleteByPrimaryKey(Integer cartid);

    int insert(MallCart record);

    int insertSelective(MallCart record);

    List<MallCart> selectByExample(MallCartExample example);

    MallCart selectByPrimaryKey(Integer cartid);

    int updateByExampleSelective(@Param("record") MallCart record, @Param("example") MallCartExample example);

    int updateByExample(@Param("record") MallCart record, @Param("example") MallCartExample example);

    int updateByPrimaryKeySelective(MallCart record);

    int updateByPrimaryKey(MallCart record);
}