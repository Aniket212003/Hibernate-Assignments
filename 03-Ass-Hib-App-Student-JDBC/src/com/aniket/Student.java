package com.aniket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Student
{

	public static void main(String[] args) throws Exception
	{
		Connection conn=null;
		PreparedStatement ps= null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Student Roll Number :");
		int rno = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Student Name :");
		String name = br.readLine();
		
		System.out.println("Enter Student Percentage :");
		Double per = Double.parseDouble(br.readLine());
		
		String dbUrl="jdbc:postgresql://localhost/mydb";
		String userName="aniket";
		String password="212003";

		try
		{
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection(dbUrl,userName,password);
			
			ps = conn.prepareStatement("insert into student1 values(?,?,?);");
			
			ps.setInt(1,rno);
			ps.setString(2,name);
			ps.setDouble(3,per);
			
			int sval=ps.executeUpdate();
			
			if(sval==1)
			{
				System.out.println("Record Inserted Successfully !!");
			}
			else
			{
				System.out.println("Something went Worng !!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			conn.close();
		}
	}
}
