package com.cg.demoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class Greeting {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/check")
    public String doCheck(){

        List<String> service = discoveryClient.getServices();

        URI uri = discoveryClient.getInstances("demo-service").stream()
                .map(si->si.getUri()).findFirst().map(s->s.resolve("/check")).get();


        return "This is check no: 2 "+service +" URL : " +uri;
    }
}
