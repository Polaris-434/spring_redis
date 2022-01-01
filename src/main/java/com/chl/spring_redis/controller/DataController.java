package com.chl.spring_redis.controller;

import com.chl.spring_redis.dao.IDataDao;
import com.chl.spring_redis.model.Classes;
import com.chl.spring_redis.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {


    @Autowired
    private DataService dataService;

    @RequestMapping("/data")
    public List<Classes> loadData() {
        System.out.println("DataController--loadData---");

        return this.dataService.loadClassesData();
    }

    @RequestMapping("/testgithub")
    public String git() {
        System.out.println("DataController--git---");

        return "github";
    }
}
