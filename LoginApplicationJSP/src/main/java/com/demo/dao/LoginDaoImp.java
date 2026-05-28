package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImp implements LoginDao{
  static Connection conn;
  
  public LoginDaoImp() {
	  conn  = DBTutil.getConnection();
  }

  @Override
  public String validateUser(String uname, String password) {
	// TODO Auto-generated method stub
	if(conn != null) {

		  
		try {
			PreparedStatement pst = conn.prepareStatement("select role from role where uname = ? and password = ?");
			pst.setString(1, uname);
			pst.setString(2, password);
		    
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				System.out.println(rs.getString(2));
				return rs.getString(1);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error occured!!!" +  e);
		}
	}
		
		

	  
	  return null;
  }
  
  
  
  
}
