package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.service.AddEmployee;

public class EmployeeServiceImpl implements AddEmployee{

	EmployeeDao dao;
	
	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
		dao = new EmployeeDaoImpl();
	}
	
	
	@Override
	public void addEmployee(int id ,String name, int Salary) {
		 dao.AddEmployeeDao(id ,name,Salary);
		// TODO Auto-generated method stub
		
	}

}
