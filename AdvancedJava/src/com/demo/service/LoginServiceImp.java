package com.demo.service;

import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImp;

public class LoginServiceImp implements LoginService{
	LoginDao dao;
	
	public LoginServiceImp() {
		// TODO Auto-generated constructor stub
		this.dao = new LoginDaoImp();
	}
	
	
	@Override
	public String validateUser(String name, String password) {
		// TODO Auto-generated method stub
        return dao.authenticateUser(name, password);
	}


	
	
	
	
	
	
}
