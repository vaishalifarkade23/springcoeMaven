package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class lifecycleInterface implements InitializingBean,DisposableBean

{
    private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public lifecycleInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "lifecycleInterface [price=" + price + "]";
	}
    
	 public void initialize()
	   {
		   System.out.println("inside init");
	   }
	   
	   public void del()
	   {
		   System.out.println("inside destroy");
	   }

	public void afterPropertiesSet() throws Exception {
		// init()
		System.out.println("taking pepsi:init");
		
	}

	public void destroy() throws Exception {
		//destoy()
		System.out.println("taking pepsi:destroy");
		
	}
}
