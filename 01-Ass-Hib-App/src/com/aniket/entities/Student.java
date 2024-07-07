package com.aniket.entities;

public class Student 
{
	private int rno;
	private String name;
	private double per;
	
	
	public Student() {}
	
	public Student(int rno, String name, double per) 
	{
		this.rno = rno;
		this.name = name;
		this.per = per;
	}
	
	public int getRno() 
	{
		return rno;
	}
	public void setRno(int rno) 
	{
		this.rno = rno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getPer() 
	{
		return per;
	}
	public void setPer(double per) 
	{
		this.per = per;
	}
	@Override
	public String toString() 
	{
		return "Student [rno=" + rno + ", name=" + name + ", per=" + per + "]";
	}	
}
