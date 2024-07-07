package com.aniket;

import java.lang.reflect.Field;

import com.aniket.entities.Student;

public class App 
{

	public static void main(String[] args)
	{
		try
		{
			Student ob = new Student(101,"Aniket",70.80,20,"Pune");
		
			Class<Student> c = Student.class;
			
			Field field[] = c.getDeclaredFields();
			for(Field f:field)
			{
				f.setAccessible(true);
				System.out.println("Student Private Data Members :  "+f.get(ob));
			}
//			Field field = c.getDeclaredField("rno");
//			Field field1 = c.getDeclaredField("name");
//			Field field2 = c.getDeclaredField("per");
//			field.setAccessible(true);
//			field1.setAccessible(true);
//			field2.setAccessible(true);
//		
//			int rno = (Integer)field.get(ob);
//			String name = (String)field1.get(ob);
//			double per = (Double)field2.get(ob);
//		
//			System.out.println("Student Roll num   : " + rno);
//			System.out.println("Student Name       : " + name);
//			System.out.println("Student Percentage : " + per);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
