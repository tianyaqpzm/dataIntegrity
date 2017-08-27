package com.pei.mapper;

import com.pei.pojo.Public;
import com.pei.pojo.PublicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicMapper {
    int countByExample(PublicExample example);

    int deleteByExample(PublicExample example);

    int deleteByPrimaryKey(String name);

    int insert(Public record);

    int insertSelective(Public record);

    List<Public> selectByExampleWithBLOBs(PublicExample example);

    List<Public> selectByExample(PublicExample example);

    Public selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Public record, @Param("example") PublicExample example);

    int updateByExampleWithBLOBs(@Param("record") Public record, @Param("example") PublicExample example);

    int updateByExample(@Param("record") Public record, @Param("example") PublicExample example);

    int updateByPrimaryKeySelective(Public record);

    int updateByPrimaryKeyWithBLOBs(Public record);
}