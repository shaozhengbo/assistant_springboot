package com.shao.dao;

import com.shao.pojo.Overtime;
import com.shao.pojo.OvertimeExample;
import com.shao.pojo.OvertimeKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OvertimeMapper {
    long countByExample(OvertimeExample example);

    int deleteByExample(OvertimeExample example);

    int deleteByPrimaryKey(OvertimeKey key);

    int insert(Overtime record);

    int insertSelective(Overtime record);

    List<Overtime> selectByExample(OvertimeExample example);

    Overtime selectByPrimaryKey(OvertimeKey key);

    int updateByExampleSelective(@Param("record") Overtime record, @Param("example") OvertimeExample example);

    int updateByExample(@Param("record") Overtime record, @Param("example") OvertimeExample example);

    int updateByPrimaryKeySelective(Overtime record);

    int updateByPrimaryKey(Overtime record);
}