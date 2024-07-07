package com.aniket;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.aniket.entities.Student;

public class App 
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		FileWriter fw = null;
		
		try
		{
			fw = new FileWriter("resources/stud.csv");
			fis = new FileInputStream("resources/student.ser");
			ois = new ObjectInputStream(fis);
			List<Student> St = new ArrayList<Student>();
			try
			{
				while(true)
				{
					Student S = (Student) ois.readObject();
					St.add(S);
				}
			}
			catch(EOFException e)
			{
				
			}
			for(Student stud : St)
			{
				fw.write(stud.getRno()+","+stud.getName()+","+stud.getPer()+"\n");
				System.out.println("Deserialized");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			fw.close();
			ois.close();
			fis.close();
		}	
	}
}
