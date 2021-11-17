package com.dao;

import com.mybatis.po.Idcard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("idCardDao")
@Mapper
public interface IdCardDao
{
    public Idcard selectCodeById(Integer i);
}
