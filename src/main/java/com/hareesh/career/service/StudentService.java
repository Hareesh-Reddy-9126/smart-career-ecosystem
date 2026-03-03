package com.hareesh.career.service;

import com.hareesh.career.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "Hareesh", "CS"),
                    new Student(2, "Yashu", "IT")
            )
    );

    // GET ALL
    public List<Student> getAllStudents() {
        return students;
    }

    // GET BY ID
    public Student getStudentById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // ADD
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    // DELETE (prepare for Day 6)
    public boolean deleteStudent(int id) {
        return students.removeIf(student -> student.getId() == id);
    }
    
 // UPDATE
    public Student updateStudent(int id, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.set(i, updatedStudent);
                return updatedStudent;
            }
        }
        return null;
    }
}