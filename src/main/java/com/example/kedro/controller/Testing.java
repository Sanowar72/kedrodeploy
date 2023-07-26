package com.example.kedro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {
    @GetMapping("home")
    public String home(){
        return "this is home for kedro...";
    }
}
