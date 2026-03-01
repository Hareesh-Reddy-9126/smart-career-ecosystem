package com.hareesh.career.controller;

import com.hareesh.career.model.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
@RestController
public class StudentController {
	
private List<Student> dynamicstudents = new ArrayList<>();

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
    
    @PostMapping("/students/new")
    public String addDynamicStudent(@RequestBody Student student) {
    	dynamicstudents.add(student);
    	return "Dynamic Student Added Successfully!";
    }
    
    @GetMapping("/students/new")
    public List<Student> getDynamicStudents(){
    	return dynamicstudents;
    }
}