package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDaoImpl implements EmployeeDao {
    public Connection conn = null;
    
    public EmployeeDaoImpl() {
		// TODO Auto-generated constructor stub
    	    conn = DBUtil.getConncetion();
    	
	}
	
	
	@Override
	public void AddEmployeeDao(int id ,String name, int salary) {
		// TODO Auto-generated method stub
		
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement("insert into Employee values(?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, salary);
			
			int rowAffected = pst.executeUpdate();
			
			if(rowAffected > 0) {
                   System.out.println("Data inserted Successfully!!");
			}else {
				System.out.println("Data not inserted !!!");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
  
	
	
}
