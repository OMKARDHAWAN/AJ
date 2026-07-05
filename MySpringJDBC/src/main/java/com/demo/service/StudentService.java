package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentRepository;
import com.demo.model.Student;


@Service
public class StudentService {
	@Autowired
  public StudentRepository studentRepository;

	public static void addStudent(Student newStudent) {
		// TODO Auto-generated method stub
		StudentRepository.save(newStudent);
	}
	
	
	
}
