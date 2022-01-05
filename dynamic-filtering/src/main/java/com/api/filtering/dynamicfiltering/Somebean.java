package com.api.filtering.dynamicfiltering;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("SomeBeanFilter")  
public class Somebean {
	private  String name;  
	private  String phone;    
	private  String salary;  
	  
	public Somebean(String name, String phone, String salary)   
	{  
	super();  
	this.name = name;  
	this.phone = phone;  
	this.salary = salary;  
	}  
	public String getName()   
	{  
	return name;  
	}  
	public void setName(String name)   
	{  
	this.name = name;  
	}  
	public String getPhone()   
	{  
	return phone;  
	}  
	public void setPhone(String phone)   
	{  
	this.phone = phone;  
	}  
	public String getSalary()   
	{  
	return salary;  
	}  
	public void setSalary(String salary)   
	{  
	this.salary = salary;  
	}  
}
