package com.demo.dao;

import java.sql.Connection;

public class RegisterDaoImpl implements RegisterDao {
 static Connection conn;
 static {
	 conn = DBTutil.getConnection();
 }
 
 public static String registerUser(){
	return null;
	 
 }
 
 
 
 }
