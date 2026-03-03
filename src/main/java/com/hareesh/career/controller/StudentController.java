package com.hareesh.career.controller;

import com.hareesh.career.model.Student;
import com.hareesh.career.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // GET ALL STUDENTS
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // GET STUDENT BY ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    // ADD NEW STUDENT
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // DELETE STUDENT BY ID
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        boolean removed = studentService.deleteStudent(id);
        if (removed) {
            return "Student deleted successfully!";
        } else {
            return "Student not found!";
        }
    }
    
 // UPDATE STUDENT BY ID
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }
}