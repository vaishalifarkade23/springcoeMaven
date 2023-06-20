package com.beanconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="com.beanconfig")
public class JavaConfig
{
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean(name={"student","temp","con"})//we can give it no of names
	public Student getStudent()
	{
		//creating new Student object
		Student student=new Student(getSamosa());
		return student;
	}

}
