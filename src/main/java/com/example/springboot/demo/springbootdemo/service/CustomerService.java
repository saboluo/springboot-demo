package com.example.springboot.demo.springbootdemo.service;

public class CustomerService {

    public String demo(){
        HomeService homeService = new HomeService();
        homeService.name = "233";
        return "hello world";

    }

}
