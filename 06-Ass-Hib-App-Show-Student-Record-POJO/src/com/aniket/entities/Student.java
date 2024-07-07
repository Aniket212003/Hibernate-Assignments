package com.aniket.entities;

public class Student 
{
	private int rno;
	private String name;
	private Double per;
	
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
	public Double getPer() 
	{
		return per;
	}
	public void setPer(Double per) 
	{
		this.per = per;
	}
	@Override
	public String toString() 
	{
		return "Student [rno=" + rno + ", name=" + name + ", per=" + per + "]";
	}
	
	
}
