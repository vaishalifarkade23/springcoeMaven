package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/stereotype/stereoconfig.xml");
		Student s1=context.getBean("student",Student.class);
		System.out.println(s1);
	}

}
