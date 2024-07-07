package com.aniket;

import com.aniket.entities.Employee;

public class Demo {

	public static void main(String[] args) 
	{
		Employee ob = new Employee();
		Employee ob2 = new Employee(101,"Aniket",12000,"Pune");
		Employee ob3 = new Employee();
		
		ob3.setEno(102);
		ob3.setEname("Nikhil");
		ob3.setSalary(120000);
		ob3.setCity("PCMC");
		
		System.out.println("Employee No.    :"+ob.getEno());
		System.out.println("Employee Name   :"+ob.getEname());
		System.out.println("Employee Salary :"+ob.getSalary());
		System.out.println("Employee City   :"+ob.getCity());
		System.out.println("-------------------------");
		System.out.println(ob);
		System.out.println(ob2);
		System.out.println(ob3);
		System.out.println("-------------------------");
		System.out.println("Employee No.    :"+ob2.getEno());
		System.out.println("Employee Name   :"+ob2.getEname());
		System.out.println("Employee Salary :"+ob2.getSalary());
		System.out.println("Employee City   :"+ob2.getCity());
		System.out.println("-------------------------");
		System.out.println("Employee No.    :"+ob3.getEno());
		System.out.println("Employee Name   :"+ob3.getEname());
		System.out.println("Employee Salary :"+ob3.getSalary());
		System.out.println("Employee City   :"+ob3.getCity());
		System.out.println("-------------------------");
		
	}

}
