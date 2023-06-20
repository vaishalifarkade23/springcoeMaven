package com.collectionvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/collectionvalue/stereoconfig.xml");
		Student s1=context.getBean("student",Student.class);
		//System.out.println(s1);
		//System.out.println(s1.getAddress());
		
		//for singletone scope object
		/*System.out.println(s1.hashCode());
		
		Student s2=context.getBean("student",Student.class);
		System.out.println(s2.hashCode());*/
		
		//for prototype using bean class
		Teacher t1=(Teacher) context.getBean("teacher");
		Teacher t2=(Teacher) context.getBean("teacher");
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
