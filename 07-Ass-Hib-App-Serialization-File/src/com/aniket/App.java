package com.aniket;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;

import com.aniket.entities.Student;

public class App {

	public static void main(String[] args) 
	{
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try
		{
			fr = new FileReader("resources/Student.csv");
			br = new BufferedReader(fr);
			fos = new FileOutputStream("resources/student.ser");
			oos = new ObjectOutputStream(fos);
			
			while(true)
			{
				String str = br.readLine();
				if(str==null)
				{
					break;
				}
				String tok[] = str.split(",");
				
				Student ob = new Student();
				ob.setRno(Integer.parseInt(tok[0]));
				ob.setName(tok[1]);
				ob.setPer(Double.parseDouble(tok[2]));
			
				oos.writeObject(ob);
				System.out.println("Object has been Serialized !!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			fos.close();
			oos.close();
			fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}
