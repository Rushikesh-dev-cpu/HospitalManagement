package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repository;

	public void saveStudent(Student s) {

	}
	
	
	public void deleteStudent(int sId) {
		repository.deleteById(sId);
	}
	
	
	public Student getStudent(int sId) {
		return repository.findById( sId).get();
	}
	
	

	public void deleteAll() {
		repository.deleteAll();
		// TODO Auto-generated method stub
		
	}
	
	
}
