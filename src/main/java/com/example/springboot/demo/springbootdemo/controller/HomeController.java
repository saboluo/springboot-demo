package com.example.springboot.demo.springbootdemo.controller;

import com.example.springboot.demo.springbootdemo.service.DemoService;
import com.example.springboot.demo.springbootdemo.service.HomeService;


public class HomeController {

    static String age = "2333";

    DemoService demoService = new DemoService();

    public String home(){
        return "";
    }


<<<<<<< Updated upstream

    public String getProduct(){
    	return "hello world!!!! h w d";
    }


    public String getCustom(){
    	return "hello world!";
    }


    public int sum(){
        return 1;
    }


    public int sum-1(){
        return 1;
=======
    public String getProduct(){
    	return " hello world!!!";
>>>>>>> Stashed changes
    }


}
