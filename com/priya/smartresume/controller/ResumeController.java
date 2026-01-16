package com.priya.smartresume.controller;

import com.priya.smartresume.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @PostMapping("/uploadResume")
    public ResponseEntity<String> uploadResume(@RequestParam("file") MultipartFile file) {

        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Please upload a resume file");
        }

        String response = resumeService.processResume(file);
        return ResponseEntity.ok(response);
    }
}
