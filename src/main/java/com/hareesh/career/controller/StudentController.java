package com.hareesh.career.controller;

import com.hareesh.career.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/health")
    public String health() {
        return "Backend Running Successfully!";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return Arrays.asList(
                new Student(1, "Hareesh", "CS"),
                new Student(2, "Rahul", "IT")
        );
    }
}