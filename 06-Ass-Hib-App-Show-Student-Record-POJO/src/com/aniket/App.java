package com.aniket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.aniket.entities.Student;

public class App 
{
	public static void main(String[] args) throws Exception
	{
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs = null;
		
		String dbUrl="jdbc:postgresql://localhost/mydb";
		String user="aniket";
		String password="212003";
		
		try
		{
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection(dbUrl,user,password);
			
			ps = conn.prepareStatement("select * from student1;");
			
			rs = ps.executeQuery();
			
			
			List<Student> passed = new ArrayList<Student>();
			List<Student> failed = new ArrayList<Student>();
			
			while(rs.next())
			{
				int r = rs.getInt("rno");
				String nm = rs.getString("name");
				Double p = rs.getDouble("per");
				
				Student ob = new Student();
				
				ob.setRno(r);
				ob.setName(nm);
				ob.setPer(p);
				if(ob.getPer()>35)
				{
					passed.add(ob);
				}
				else
				{
					failed.add(ob);
				}
			}
			System.out.println("-----------Passed Records--------");
			for(Student S : passed)
			{
				System.out.println(S);
			}
			System.out.println("-----------Failed Records--------");
			for(Student S : failed)
			{
				System.out.println(S);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			rs.close();
			conn.close();
		}
		
	}

}
