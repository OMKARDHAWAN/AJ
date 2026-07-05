package com.demo.dao;

import java.sql.JDBCType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public class StudentRepository {
   
   @Autowired
   public static JdbcTemplate jdbcTemplate;

   
   public StudentRepository(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
   }


   public static void save(Student newStudent) {
	// TODO Auto-generated method stub
	 String query = "insert into Student values(?,?,?)";
	  try {
		jdbcTemplate.update(query,newStudent.getId(),newStudent.getName(),newStudent.getAge());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
   
   
}
