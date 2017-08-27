package com.pei.mapper;

import com.pei.pojo.Filetag;
import com.pei.pojo.FiletagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FiletagMapper {
    int countByExample(FiletagExample example);

    int deleteByExample(FiletagExample example);

    int deleteByPrimaryKey(String name);

    int insert(Filetag record);

    int insertSelective(Filetag record);

    List<Filetag> selectByExampleWithBLOBs(FiletagExample example);

    List<Filetag> selectByExample(FiletagExample example);

    Filetag selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Filetag record, @Param("example") FiletagExample example);

    int updateByExampleWithBLOBs(@Param("record") Filetag record, @Param("example") FiletagExample example);

    int updateByExample(@Param("record") Filetag record, @Param("example") FiletagExample example);

    int updateByPrimaryKeySelective(Filetag record);

    int updateByPrimaryKeyWithBLOBs(Filetag record);

    int updateByPrimaryKey(Filetag record);
}