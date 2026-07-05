package com.demo.DButil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
  static Connection conn = null ;
  
  public static Connection getMyConncetion() {
	 try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		String url = "jdbc:mysql://localhost:3306/db2?useSSL=false&PublicKeyRetrival=false";
		conn = DriverManager.getConnection(url,"root","12345");
	 } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 } 
	 
	 return conn;
  }
  

  public static void closeMyConnection() {
	 try {
		conn.close();
	 } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 } 
  }
  
}
