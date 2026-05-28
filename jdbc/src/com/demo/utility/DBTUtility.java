package com.demo.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBTUtility {
 static Connection conn;
 
 public static Connection getMyconnect() {
	 if(conn == null) {
      try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	    String url = "jdbc:mysql://localhost:3306/db1?useSSL=false&allowPublickeyRetrieval=true";
		conn = DriverManager.getConnection(url,"root","12345");
		
		if(conn != null ) {
			System.out.println("Connection Established!!!!");
		}else {
			System.out.println("Connection not Established!!!");
		}
		
		
	  } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  
	
	 }
	
	 
	 return conn;
 }
 
 
 
}
