package com.aniket;

import com.aniket.entities.Student;

public class Demo {

	public static void main(String[] args) 
	{
		Student ob = new Student();
		Student ob2 =  new Student(102,"Vaii",61.90);
		
		ob.setRno(101);
		ob.setName("Aniket");
		ob.setPer(47.60);
		
		System.out.println("Roll Number :" + ob.getRno());
		System.out.println("Name        :" + ob.getName());
		System.out.println("Percentage  :" + ob.getPer());
		System.out.println("------------------------");
		System.out.println(ob);
		System.out.println(ob2);
		System.out.println("Roll Number :" + ob2.getRno());
		System.out.println("Name        :" + ob2.getName());
		System.out.println("Percentage  :" + ob2.getPer());
	}
}
