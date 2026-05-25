package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.utility.DBUtil;

public class LoginDaoImpl implements LoginDao{
   static Connection conn;
   
   static {
	   conn = DBUtil.getMyConnection();
   }
	@Override
	public String authentication(String uname, String psword) {
		// TODO Auto-generated method stub
		String role = null;
		
		if(conn != null) {
			System.out.println("Connection established!!");
			try {
				PreparedStatement pst = conn.prepareStatement("select * from role where uname = ? and password = ?");
				pst.setString(1, uname);
				pst.setString(2, psword);
				ResultSet rs = pst.executeQuery();
				
				if(rs.next()){
					role = rs.getString(3);
				}
				return role;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			String msg ="Connection not established!!";
			System.out.println(msg);
			return msg;
		}
		return null;	
				
		
	
	
	}

}
