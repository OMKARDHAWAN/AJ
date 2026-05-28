package com.demo.services;

import com.demo.model.MyUser;

public interface RegisterService {
  public MyUser registerUser(String email, String uname, String password, String role);
}
