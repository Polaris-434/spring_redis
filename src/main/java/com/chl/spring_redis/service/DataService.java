package com.chl.spring_redis.service;

import com.chl.spring_redis.dao.IDataDao;
import com.chl.spring_redis.model.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    @Autowired
    private IDataDao dao;

    //注意是"  ' list  '  ":三引号
    @Cacheable(value = "t_classes", key = "'list'")
    public List<Classes> loadClassesData() {
        System.out.println("DataService--loadClassData----");
        return this.dao.loadDatas();
    }
}
