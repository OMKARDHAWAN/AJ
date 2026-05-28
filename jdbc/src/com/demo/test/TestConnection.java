package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
   public static void main(String[] args) {
//	step 1   
	   Connection conn; 
	   try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		String url="jdbc:mysql://localhost:3306/db1?useSSL=false&allowPublicKeyRetrieval=true";
		conn = DriverManager.getConnection(url,"root","12345");
		if(conn != null) {
			System.out.println("Connection Established!!!");
		}else {
			System.out.println("Connection not established!!!!");
		}
		
	   } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    
	   
	   }
	   
 }
}
