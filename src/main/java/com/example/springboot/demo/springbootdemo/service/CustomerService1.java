package com.example.springboot.demo.springbootdemo.service;

public class CustomerService1 {

    public String demo(){
    	System.out.println("oneeeeeewqw");
    	System.out.println("twooooowqwqw");
    	System.out.println("three");
        HomeService homeService = new HomeService();
        homeService.name = "233";
        return "hello world";

    }

}