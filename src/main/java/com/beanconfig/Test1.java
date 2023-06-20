package com.beanconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args)
	{
		// ApplicationContext context=new ClasspathxmlApplicatonContext(Student.class)
	   //Student s1=context.getBean("fstudent",Student.class); //@Component from Student.java
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student=context.getBean("con",Student.class);  //we can use bean name also from JavaConfig.java
		//Student student=context.getBean("getStudent",Student.class);//method annotaion @Bean getStudent is method name we use here from JavaConfig.java
		System.out.println(student);
		student.study();
	}

}
