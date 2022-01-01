package com.chl.spring_redis.model;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class Classes implements Serializable {
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    private int cid;

    private String cname;
}
