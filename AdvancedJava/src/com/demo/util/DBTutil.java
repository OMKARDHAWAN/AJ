package com.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTutil {
	 static Connection conn;
	  
	  public static Connection getConnect(){
		  try {
			  //register connection
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/db1?useSSL=false&allowPublicKeyRetrieval=true";
            //create connection 
			 conn=DriverManager.getConnection(url,"root","12345");
			if(conn != null) {
				System.out.println("Connection Established!!!");
			}else {
				System.out.println("Conncetion not Established!!!");
			}
			
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		  
		  
		 
		  return conn;
	  }
}
