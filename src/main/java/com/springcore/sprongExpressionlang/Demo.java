package com.springcore.sprongExpressionlang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+11}")  //SpEL lang
	private int x;
	
	@Value("#{7-3}")
	private int y;
	
	
	@Value("#{T(java.lang.Math).sqrt(25)}")  //method//use ctlr+shift+t
	private int z;
	
	@Value("#{T(java.lang.Math).E}")  //variable //use ctlr+shift+t
	private double e;
	
	@Value("#{new java.lang.String('prachi raut')}")
	private String name; //object
	
	@Value("#{8>3}")
	private boolean isActive;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	
	
	
	

}
