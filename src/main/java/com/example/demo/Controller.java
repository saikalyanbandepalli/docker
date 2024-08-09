package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class Controller {

    @GetMapping("/data")
    public String getdata(){
        return " This is a get docker ";
    }

    @GetMapping("/set")
    public String setdata(){
        return " This is a set docker ";
    }

}
