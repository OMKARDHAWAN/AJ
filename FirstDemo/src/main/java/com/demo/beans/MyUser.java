package com.demo.beans;

import java.time.LocalDate;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyUser implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean{
  private int cid;
  private String name;
  private int rollno;
  private LocalDate birthdate;
  public MyUser() {
	super();
	System.out.println("Hello from MyUser Default Constructor!!!!");
  }
  
  
  public MyUser(int cid, String name, int rollno,LocalDate date) {
	super();
	this.cid = cid;
	this.name = name;
	this.rollno = rollno;
	this.birthdate = date;
	System.out.println("Hello from MyUser parameterised Constructor!!!!");
}


  public int getCid() {
	return cid;
  }
  public void setCid(int cid) {
	this.cid = cid;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public int getRollno() {
	return rollno;
  }
  public void setRollno(int rollno) {
	this.rollno = rollno;
  }


  public LocalDate getBirthdate() {
	return birthdate;
  }


  public void setBirthdate(LocalDate birthdate) {
	this.birthdate = birthdate;
  }


  @Override
  public String toString() {
	return "MyUser [cid=" + cid + ", name=" + name + ", rollno=" + rollno + ", birthdate=" + birthdate + "]";
  }


  @Override
  public void setBeanName(String name) {
	System.out.println("In setBeanName Method!!!!");
  }


  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	// TODO Auto-generated method stub
	System.out.println("In setBeanFactory Method");
  }


  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	// TODO Auto-generated method stub
	  System.out.println("In Application Context Method!!!");
	
  }


  @Override
  public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	  System.out.println("In Initilzing beans");
	
  }


  @Override
  public void destroy() throws Exception {
	// TODO Auto-generated method stub
	  System.out.println("In Destroyable bean interface");
  }
  
//  custom init method
  public void init() {
	  System.out.println("In custom init method!!!");
  }
  
//  custom destroy method 
  public void Destroy() {
	  System.out.println("In custom destroy method!!!");
  }
  
  
  
  
}
