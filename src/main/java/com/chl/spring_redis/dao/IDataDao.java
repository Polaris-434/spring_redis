package com.chl.spring_redis.dao;

import com.chl.spring_redis.model.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IDataDao {
    @Select("select * from t_classes")
    public List<Classes> loadDatas();
}
