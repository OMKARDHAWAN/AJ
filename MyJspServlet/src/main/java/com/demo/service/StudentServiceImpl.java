package com.demo.service;

import java.util.List;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.model.Student;

public class StudentServiceImpl implements StudentService{
     public StudentDao dao;
	
     public StudentServiceImpl() {
	   dao = new StudentDaoImpl();
     }
	
	@Override
	 public int addStudent(int id, String name, int age) {
		 return dao.addStudent(id,name,age); 
	 }

	@Override
	public List<Student> fetchStudent() {
		// TODO Auto-generated method stub
		return dao.getStudentList();
	}

}
