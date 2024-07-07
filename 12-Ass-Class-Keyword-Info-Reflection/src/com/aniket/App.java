package com.aniket;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.aniket.entities.Student;

public class App 
{

	public static void main(String[] args) 
	{
		System.out.println("-----Student Class Information------");
		
		Class<Student> c = Student.class;
		
		System.out.println("Parent Class : " + c.getSuperclass());
		
		Field fields[] = c.getDeclaredFields();
		
		System.out.println("\n\n-----------Data Members-------- ");
		for(Field f:fields)
		{
			System.out.println(f);
		}
		
		System.out.println("\n\n----------Member Methods-----------");
		
		Method method[] = c.getDeclaredMethods();
		
		for(Method m : method)
		{
			System.out.println(m);
		}
		
		System.out.println("\n\n----------Constructors Methods-----------");
		
		Constructor<?> constructor[] = c.getDeclaredConstructors();
		
		for(Constructor<?> conn : constructor)
		{
			System.out.println(conn);
		}
	}

}
