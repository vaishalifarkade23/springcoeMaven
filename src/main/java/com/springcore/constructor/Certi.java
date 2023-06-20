package com.springcore.constructor;

public class Certi
{
   String fname;

public Certi(String fname) 
{
	super();
	this.fname = fname;
}

@Override
public String toString()
{
	return this.fname;
}
  
}
