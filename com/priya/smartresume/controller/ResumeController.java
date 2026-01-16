package com.priya.smartresume.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResumeController {

    @GetMapping("/test")
    public String testApi() {
        return "Smart Resume Analyzer Backend is Running!";
    }
}
