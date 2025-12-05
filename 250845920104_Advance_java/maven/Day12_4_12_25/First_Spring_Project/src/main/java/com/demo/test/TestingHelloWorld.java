package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Emlpyee;
import com.demo.bean.HelloWorld;

public class TestingHelloWorld {

	

	public static void main(String[] args) {
		// now here testing the Hello World 
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		HelloWorld ab=(HelloWorld) ctx.getBean("h1");
		ab.sayHello();
		
		// now getting the object of the Emplyee
		Emlpyee e=(Emlpyee) ctx.getBean("emp1");
		System.out.println(e); // printing the OBject of the Emplyeee perfomrd the Setter Injection in  XML File
		
		// now getting the object of the Emplyee
		Emlpyee e1=(Emlpyee) ctx.getBean("emp2");
		System.out.println(e1); // printing the OBject of the Emplyeee perfomrd the Constructor Injection in  XML File
		
//		closing the resource
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
