package com.example.springboot.demo.springbootdemo.service;

public class DemoService {

    public String demo(){
        HomeService homeService = new HomeService();
        homeService.name = "233";
        return "hello world";

    }


    public void sum(){}


    public void sum1(){}


}
