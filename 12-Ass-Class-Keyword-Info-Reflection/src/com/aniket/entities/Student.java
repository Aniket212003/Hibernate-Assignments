package com.aniket.entities;

public class Student 
{
	private Integer rno;
	private String name;
	private Double per;
	
	public Student()
	{
		rno = null;
		name = null;
		per = null;
	}
	
	public Student(Integer rno,String name,Double per)
	{
		this.rno=rno;
		this.name=name;
		this.per=per;
	}
	
	public void setRno(Integer rno)
	{
		this.rno=rno;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public void setPer(Double per)
	{
		this.per=per;
	}
	
	public Integer getRno()
	{
		return rno;
	}
	public String getName()
	{
		return name;
	}
	public Double getPer()
	{
		return per;
	}
	
	public void display()
	{
		System.out.println("------Student Information------");
		System.out.println("Roll Number :" + rno);
		System.out.println("Name        :" + name);
		System.out.println("Percentage  :" + per);
	}
	public String toString() 
	{
		return "Student [rno=" + rno + ", name=" + name + ", per=" + per + "]";
	}
}
