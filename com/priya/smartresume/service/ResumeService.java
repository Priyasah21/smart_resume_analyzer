package com.priya.smartresume.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ResumeService {

    public String processResume(MultipartFile file) {
        return "Resume processed successfully: " + file.getOriginalFilename();
    }
}
