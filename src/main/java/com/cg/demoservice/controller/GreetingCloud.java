package com.cg.demoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingCloud {
    @GetMapping("hello")
    public String checkCloud()
    {
        return "Hi from GCP cloud!!";
    }
}
