package com.cn.shenzhen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(DemoController.modelPath)
public class DemoController {

    public  static  final  String modelPath="/demo";

    @GetMapping("/query/{id}")
    public List  queryDemo(@PathVariable String id){
        return  null;
    }
}
