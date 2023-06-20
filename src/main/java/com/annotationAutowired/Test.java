package com.annotationAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.awt.AppContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context=new ClassPathXmlApplicationContext("com/annotationAutowired/auto.xml");
			Emp emp=context.getBean("emp1",Emp.class); //when we dont want to type cast
			//Emp emp=(Emp) context.getBean("emp1"); //type casting
			System.out.println(emp);
	}

}
