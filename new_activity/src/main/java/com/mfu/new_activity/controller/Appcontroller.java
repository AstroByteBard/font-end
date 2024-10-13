package com.mfu.new_activity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Appcontroller {
    
    @GetMapping("/")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
