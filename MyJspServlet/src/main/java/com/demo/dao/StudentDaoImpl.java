package com.demo.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.demo.DButil.DButil;
import com.demo.model.Student;

public class StudentDaoImpl implements StudentDao{

	public static Connection conn;
	
	
	public StudentDaoImpl() {
		// TODO Auto-generated constructor stub
	    conn = DButil.getMyConncetion();
	}
	
	
	
	
	@Override
	public int addStudent(int id, String name, int age) {
		// TODO Auto-generated method stub
		
		PreparedStatement pst;
		try {
			
			pst = conn.prepareStatement("insert into Student values(?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, age);
			
			int rowAffected = pst.executeUpdate();
			
			return rowAffected;
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return -1;
	}




	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		
		
		try {
			Statement st = conn.createStatement();
			String query = "select * from Student";
			ResultSet rst = st.executeQuery(query);
			
			while(rst.next()) {
				System.out.println("Id : "+rst.getInt(1));
				int id = rst.getInt("id");
				String name = rst.getString("name");
				int age = rst.getInt("age");
				System.out.println(id);
				list.add(new Student(id,name,age));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
