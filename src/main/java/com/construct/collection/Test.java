package com.construct.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/construct/collection/config.xml");
		Emp e1=(Emp) context.getBean("emp");
        System.out.println(e1);
	}

}
