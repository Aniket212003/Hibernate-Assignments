package com.aniket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Employee 
{
	public static void main(String[] args) throws Exception 
	{
		Connection conn = null;
		PreparedStatement ps = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Employee Number :");
		int eno = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Employee Name :");
		String ename = br.readLine();
		
		System.out.print("Enter Employee Salary :");
		Double salary = Double.parseDouble(br.readLine());
		
		System.out.println("Enter Employee City :");
		String city = br.readLine();
		
		String dbUrl="jdbc:postgresql://localhost/mydb";
		String userName="aniket";
		String password="212003";

		try
		{
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection(dbUrl,userName,password);
			
			ps = conn.prepareStatement("insert into employee values(?,?,?,?);");
			
			ps.setInt(1, eno);
			ps.setString(2, ename);
			ps.setDouble(3, salary);
			ps.setString(4, city);
			
			int sval = ps.executeUpdate();
			
			if(sval==1)
			{
				System.out.println("Record Inserted Successfully !!");
				
			}
			else
			{
				System.out.println("Something Went Wrong !!");
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
