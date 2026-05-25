package com.demo.services;

import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServicesImpl implements LoginServices{
    public LoginDao dao;
    public LoginServicesImpl() {
		// TODO Auto-generated constructor stub
    	this.dao = new LoginDaoImpl();
	}
	@Override
	public String checkValidation(String uname, String psword) {
		 return dao.authentication(uname,psword);
	}
}
