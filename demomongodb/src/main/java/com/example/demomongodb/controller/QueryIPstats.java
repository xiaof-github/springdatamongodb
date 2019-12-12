package com.example.demomongodb.controller;

import com.alibaba.fastjson.JSON;
import com.example.demomongodb.service.IPStatsOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryIPstats {

    @Autowired
    private IPStatsOperation IPStatsOperation;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String queryIPstats(){

        return JSON.toJSONString(IPStatsOperation.query());
    }

    @RequestMapping(value = "/aggregation", method = RequestMethod.GET)
    public String aggregationIPstats(){

        return JSON.toJSONString(IPStatsOperation.aggregation());
    }
}
