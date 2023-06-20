package com.construct.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp
{
	 String name;
	List<String> phones;
	 Set<String> addresses;
	 Map<String, String> courses;
	
	public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses + "]";
	}
	
	
    
}
