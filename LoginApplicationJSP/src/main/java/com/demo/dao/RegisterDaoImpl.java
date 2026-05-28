package com.demo.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.model.MyUser;

public class RegisterDaoImpl implements RegisterDao {
 static Connection conn;
 
 static {
	 conn = DBTutil.getConnection();
 }
 
 
 @Override
 public MyUser registerUser(String email, String uname, String password,String role) {
	// TODO Auto-generated method stub
    
   if(conn != null) {
	   
		try {
		    PreparedStatement pst = conn.prepareStatement("insert into role value(?,?,?,?)");
			pst.setString(1, email);
			pst.setString(2, uname);
			pst.setString(3, password);
			pst.setString(4,role);
			
			int n = pst.executeUpdate();
			
			if(n > 0) {
			 return new MyUser(email,uname,password,role);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
	 
	 return null;
   	
 }
 
 
 
 }
