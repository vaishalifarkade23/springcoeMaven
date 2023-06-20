package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
//        LifecycleMethods l1=(LifecycleMethods) context.getBean("s1");
//        System.out.println(l1);
//        context.registerShutdownHook();
        
       /* System.out.println("-------------------------------");
        lifecycleInterface i1=(lifecycleInterface) context.getBean("m1");
        context.registerShutdownHook();*/
        
        System.out.println("-------------------------------");
        context.registerShutdownHook();
        LifecycleAnnotation la=(LifecycleAnnotation) context.getBean("a1");
        System.out.println(la);
	}

}
