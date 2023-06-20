package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
         ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
         Emp emp2=(Emp) context.getBean("emp1");
         System.out.println(emp2.getName());
         System.out.println(emp2.getPhones());
         System.out.println(emp2.getAddresses());
         System.out.println(emp2.getCourses());
	}

}
