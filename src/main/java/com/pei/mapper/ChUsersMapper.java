package com.pei.mapper;

import com.pei.pojo.ChUsers;
import com.pei.pojo.ChUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChUsersMapper {
    int countByExample(ChUsersExample example);

    int deleteByExample(ChUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChUsers record);

    int insertSelective(ChUsers record);

    List<ChUsers> selectByExample(ChUsersExample example);

    ChUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChUsers record, @Param("example") ChUsersExample example);

    int updateByExample(@Param("record") ChUsers record, @Param("example") ChUsersExample example);

    int updateByPrimaryKeySelective(ChUsers record);

    int updateByPrimaryKey(ChUsers record);
}