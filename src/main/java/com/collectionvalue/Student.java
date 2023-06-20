package com.collectionvalue;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")          // @scope for prototype scope
public class Student 
{
	@Value("prachi")
	private String sname;
	@Value("nagpur")
	private String city;
	
	@Value("#{temp}")
	private List<String> address;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", city=" + city + "]";
	}
	
	

}
