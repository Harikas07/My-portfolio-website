package com.harika.portfolio.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class ResumeController {

    @GetMapping("/resume/download")
    public ResponseEntity<byte[]> downloadResume() {
        try {
            // Load resume from resources or attached_assets
            ClassPathResource resource = new ClassPathResource("static/attached_assets/Resume_updated.pdf");

            if (!resource.exists()) {
                return ResponseEntity.notFound().build();
            }

            byte[] resumeBytes = resource.getInputStream().readAllBytes();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData("attachment", "Harika_Sunkara_Resume.pdf");

            return ResponseEntity.ok()
                    .headers(headers)
                    .body(resumeBytes);

        } catch (IOException e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}