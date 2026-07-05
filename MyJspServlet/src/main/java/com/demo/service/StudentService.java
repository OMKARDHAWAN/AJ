package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {
    public int addStudent(int id ,String name,int age);

	public List<Student> fetchStudent();
}
