package com.springcore.lifecycle;

public class LifecycleMethods
{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price)
	{
		System.out.println("setting price");
		this.price = price;
		
	}
    
	
	public LifecycleMethods() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LifecycleMethods [price=" + price + "]";
	}
	
   public void init()
   {
	   System.out.println("inside init");
   }
   
   public void destroy()
   {
	   System.out.println("inside destroy");
   }
}
