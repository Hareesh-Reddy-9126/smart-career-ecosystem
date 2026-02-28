package com.hareesh.career.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/health")
    public String health() {
        return "Backend Running Successfully!";
    }
}