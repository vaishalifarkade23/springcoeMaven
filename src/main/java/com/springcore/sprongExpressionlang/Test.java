package com.springcore.sprongExpressionlang;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/sprongExpressionlang/Exp.xml");
	    Demo d1=context.getBean("demo",Demo.class);
	    System.out.println(d1);
	    
	    
	    //here is error 24 lec
	   // SpelExpressionParser temp= new SpelExpressionParser();
	   // Expression expression= (Expression) temp.parseExpression("22+8");
	    //System.out.println(expression.getValue());
	}

}
