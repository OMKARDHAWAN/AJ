package com.demo.services;

import com.demo.dao.RegisterDao;
import com.demo.dao.RegisterDaoImpl;
import com.demo.model.MyUser;

public class RegisterServiceImpl implements RegisterService{
  static RegisterDao dao;
  public RegisterServiceImpl(){
	  this.dao = new RegisterDaoImpl();
  }
  
  @Override
  public MyUser registerUser(String email, String uname, String password,String role) {
	// TODO Auto-generated method stub
	return dao.registerUser(email,uname,password,role);
  }
  
 
  
  
}
