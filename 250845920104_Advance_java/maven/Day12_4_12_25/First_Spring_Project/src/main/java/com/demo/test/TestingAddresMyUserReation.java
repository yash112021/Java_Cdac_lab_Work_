package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.MyUser;

public class TestingAddresMyUserReation {
	public static void main(String[] args) {
		// now we are going to  test a has a relation 
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		// now retriveing the User which has a realion with address one and then printing it 
		MyUser usr=(MyUser) ctx.getBean("usr");  
		// priting the obejct of the user
		System.out.println(usr);
		
		// closing the Resources 
		((ClassPathXmlApplicationContext)ctx).close();
	
	}
}
