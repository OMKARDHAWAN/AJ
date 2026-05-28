package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.demo.util.DBTutil;

public  class LoginDaoImp implements LoginDao{

	static Connection conn;
	
	static {
		conn = DBTutil.getConnect();
	}

	@Override
	public String authenticateUser(String name, String password) {
		// TODO Auto-generated method stub
		
	
		try {
		
			 if(conn == null) {
			        System.out.println(
			            "Connection is null"
			        );
			    }
			
			
			PreparedStatement pst = conn.prepareStatement("select * from Role where uname = ? and password = ?");
			pst.setString(1, name);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();    
			if(rs.next()){
				return rs.getString(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	
   

  
  
  
}
