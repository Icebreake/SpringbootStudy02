package com.example.controller;

import com.example.bean.Person1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Person1 person;

    @ResponseBody
    @RequestMapping("/hello")
    public Person1 hello(){
        return person;
    }


//    @RequestMapping("/index")
//    public Object Index(){
//        return "Springboot 第一次启动";
//    }

}
