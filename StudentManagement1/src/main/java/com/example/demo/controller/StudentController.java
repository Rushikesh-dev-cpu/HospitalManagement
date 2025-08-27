package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;

	@PostMapping("student")
	String addStudent(@PathVariable Student s) {

		ss.saveStudent(s);
		return "student added";

	}

	@GetMapping("student/{sId}")
	Student getStudent(@PathVariable int sId) {
		return ss.getStudent(sId);

	}

	@DeleteMapping("student/{sId}")
	String DeleteStudent(@PathVariable int sId) {
		ss.deleteStudent(sId);
		return "student is deleted";

	}

	@DeleteMapping("students")
	String deleteAll() {

		ss.deleteAll();
		return " all student are deleted";

	}

}
