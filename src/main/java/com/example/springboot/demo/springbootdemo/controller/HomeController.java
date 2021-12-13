package com.example.springboot.demo.springbootdemo.controller;

import com.example.springboot.demo.springbootdemo.service.DemoService;
import com.example.springboot.demo.springbootdemo.service.HomeService;

public class HomeController {

    static String age = "2333";

    DemoService demoService = new DemoService();

    public String home(){
        return "";
    }

}
