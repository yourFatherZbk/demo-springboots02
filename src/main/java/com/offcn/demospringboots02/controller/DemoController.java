package com.offcn.demospringboots02.controller;


import com.offcn.demospringboots02.pojo.Offcn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
@EnableConfigurationProperties({Offcn.class})
public class DemoController {

    @Value("${offcn.beijing}")
    String str;

    @Autowired
    Offcn offcn;

    @RequestMapping("/")
    public String getValue(){
        return offcn+","+str;
    }
}
