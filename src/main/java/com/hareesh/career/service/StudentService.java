package com.hareesh.career.service;

import com.hareesh.career.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService{
	private List<Student> students =  new ArrayList<>(
			Arrays.asList(
					new Student(1, "Hareesh", "CS"),
					new Student(2, "Yashu", "IT")
					)
			);
	public List<Student> getAllStudents(){
		return students;
	}
	public Student addStudent(Student student) {
		students.add(student);
		return student;
	}
}

