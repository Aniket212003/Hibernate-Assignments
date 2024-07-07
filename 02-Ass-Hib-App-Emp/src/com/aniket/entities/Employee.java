package com.aniket.entities;

public class Employee 
{
	private int eno;
	private String ename;
	private double salary;
	private String city;
	
	
	
	public Employee() {}
	
	public Employee(int eno, String ename, double salary, String city) 
	{
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.city = city;
	}
	
	public int getEno() 
	{
		return eno;
	}
	public void setEno(int eno) 
	{
		this.eno = eno;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	@Override
	public String toString() 
	{
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", city=" + city + "]";
	}
	
}
