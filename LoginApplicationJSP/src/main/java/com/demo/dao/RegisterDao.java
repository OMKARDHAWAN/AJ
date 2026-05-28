package com.demo.dao;

import com.demo.model.MyUser;

public interface RegisterDao {

	public MyUser registerUser(String email, String uname, String password,String role);

}
