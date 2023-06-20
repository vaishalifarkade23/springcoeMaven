package com.annotationAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.sun.jndi.cosnaming.IiopUrl.Address;

public class Emp 
{
	@Autowired
	@Qualifier("address")
	private Address address;
    
	//@Autowired
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//@Autowired
    public Emp(Address address) {
		super();
		this.address = address;
	}

    @Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}
