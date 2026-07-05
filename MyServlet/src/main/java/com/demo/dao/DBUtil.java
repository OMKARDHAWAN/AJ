package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBUtil {
    public static Connection Conn = null;
    
    public static Connection getConncetion() {
    	if(Conn == null) {
       	 
    		try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//				String url="jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true";
			    String url = "jdbc:mysql://localhost:3306/db2?useSSL=false&PublicKeyRetrieval=true";
			    Conn = DriverManager.getConnection(url,"root","12345");
			    
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
        }
    	return Conn;
    }
    
    public void closeConnection() {
    	try {
		Conn.close();	
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
	
	
	
}  
