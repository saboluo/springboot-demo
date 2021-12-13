package com.example.springboot.demo.springbootdemo.controller;



public class DemoController {

    static String age = "2333";

    DemoService demoService = new DemoService();

    public String home(){
        return "";
    }



    public String getProduct(){
    	return "hello world!!!! h w d";
    }


    public String getCustom(){
    	return "hello world!";



}
