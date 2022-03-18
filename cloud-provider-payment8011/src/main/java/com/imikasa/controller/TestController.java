package com.imikasa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestController {

    @Value("server.port")
    private String port;

    @GetMapping("/test")
    public String test(){
        return "this application's port is:"+port+"\t"+ UUID.randomUUID().toString();
    }

}
