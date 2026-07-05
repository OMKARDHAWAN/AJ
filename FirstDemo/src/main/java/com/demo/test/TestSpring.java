package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.beans.HelloWorld;
import com.demo.beans.MyUser;

public class TestSpring {
public static void main(String[] args) {

	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("myspringconfig.xml");
	System.out.println("After creating context!!!");
	
	
	MyUser mx = (MyUser) ctx.getBean("u2");

	System.out.println(mx.getCid());
	System.out.println(mx.getName());
	System.out.println(mx.getRollno());	
	System.out.println(mx.getBirthdate());
	
    System.out.println(mx);
    ((ClassPathXmlApplicationContext) ctx).close();

	
	
	
}
}
