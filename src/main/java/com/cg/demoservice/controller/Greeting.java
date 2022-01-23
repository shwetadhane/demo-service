package com.cg.demoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Greeting {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/check")
    public String doCheck(){

        List<String> service = discoveryClient.getServices();
        return "This is check no: 2 "+service;
    }
}
