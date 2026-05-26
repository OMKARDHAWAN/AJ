package com.demo.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTutil {
  static Connection conn;
  
  public static Connection getConnection() {
	  if(conn == null) {
		  try {
			  DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			  String url = "jdbc:mysql://localhost:3306/db1?useSSL=false&allowPublicKeyRetrieval=true";
			  conn = DriverManager.getConnection(url,"root","12345");
			  return conn;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		  
	  }
	  
	  return null;
  }
  
  
  public static void closeMyConnetion() {
	  try {
		conn.close();
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  
  }
}
