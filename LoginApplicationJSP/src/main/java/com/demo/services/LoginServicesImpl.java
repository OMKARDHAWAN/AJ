package com.demo.services;

import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImp;
import com.demo.servlets.LoginServlet;

public class LoginServicesImpl implements LoginServices{
  LoginDao dao;
  
  public LoginServicesImpl() {
	 this.dao = new LoginDaoImp();
  }

  @Override
  public String authenticateUser(String uname, String password) {
	// TODO Auto-generated method stub
	return dao.validateUser(uname,password);
  }
  
  
  
	
	
}
