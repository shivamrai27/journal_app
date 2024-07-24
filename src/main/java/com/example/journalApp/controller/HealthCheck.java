package com.example.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HealthCheck {
    @GetMapping("/check")
    public String healthcheck(){
        return "Health is okay";
    }


}
