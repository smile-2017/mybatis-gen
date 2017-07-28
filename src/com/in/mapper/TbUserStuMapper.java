package com.in.mapper;

import com.in.pojo.TbUserStu;
import com.in.pojo.TbUserStuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserStuMapper {
    int countByExample(TbUserStuExample example);

    int deleteByExample(TbUserStuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUserStu record);

    int insertSelective(TbUserStu record);

    List<TbUserStu> selectByExampleWithBLOBs(TbUserStuExample example);

    List<TbUserStu> selectByExample(TbUserStuExample example);

    TbUserStu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUserStu record, @Param("example") TbUserStuExample example);

    int updateByExampleWithBLOBs(@Param("record") TbUserStu record, @Param("example") TbUserStuExample example);

    int updateByExample(@Param("record") TbUserStu record, @Param("example") TbUserStuExample example);

    int updateByPrimaryKeySelective(TbUserStu record);

    int updateByPrimaryKeyWithBLOBs(TbUserStu record);

    int updateByPrimaryKey(TbUserStu record);
}