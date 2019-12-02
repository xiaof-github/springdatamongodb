package com.example.demomongodb.controller;

import com.example.demomongodb.service.WriteIPStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private WriteIPStats writeIPStats;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld(){
        return "hello world";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(){
        writeIPStats.addCollection();
        return "add success";
    }

}
