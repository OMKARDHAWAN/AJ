package com.demo.services;

public interface LoginServices {

	String authenticateUser(String uname, String password);

	Boolean updatePassword(String email ,String newpassword);
  
}
