package com.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/standaloneCollection/aloneconfig.xml");
         Person p1  =(Person) context.getBean("person1");
         System.out.println(p1);
         System.out.println(p1.getFrinds().getClass().getName());//to check which type of collection class is use eg arrayList,LinkedList
         
         System.out.println("---------------------");
         System.out.println(p1.getFee());
         System.out.println(p1.getFee().getClass().getName());
         
         System.out.println("---------------------");
         System.out.println(p1.getPropes());
         
         
	}

}
