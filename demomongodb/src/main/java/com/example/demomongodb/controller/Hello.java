package com.example.demomongodb.controller;

import com.example.demomongodb.service.IPStatsOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private IPStatsOperation IPStatsOperation;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld(){
        logger.info("hello");
        logger.debug("this is debug");

        return "hello world";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(){
        IPStatsOperation.addCollection();
        return "add success";
    }


}
