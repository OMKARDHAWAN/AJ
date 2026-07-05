package com.demo.dao;

import java.util.List;

import com.demo.model.Student;

public interface StudentDao {
   public int addStudent(int id ,String name , int age);

   public List<Student> getStudentList();
}
