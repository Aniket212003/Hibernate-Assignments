package com.aniket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App 
{
	public static void main(String[] args) throws Exception
	{
		Connection conn=null;
		PreparedStatement ps=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		String dbUrl="jdbc:postgresql://localhost/mydb";
		String user="aniket";
		String pass="212003";
		
		try 
		{
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection(dbUrl,user,pass);
			
			
			fr=new FileReader("resources/Student.csv");
			br=new BufferedReader(fr);
			
			ps=conn.prepareStatement("insert into Student1 values(?,?,?);");
			
			while(true)
			{
				String line=br.readLine();
				if(line==null)
				{
					break;
				}
				
				String tok[]=line.split(",");
				try 
				{
					ps.setInt(1,Integer.parseInt(tok[0]));
					ps.setString(2,tok[1]);
					ps.setDouble(3,Double.parseDouble(tok[2]));
				
				
					int sval = ps.executeUpdate();
				
					if(sval==1)
					{
					System.out.println("Record Inserted Successfully !!");
					}
				}
				catch(Exception e)
				{
					System.out.println("Ignored records :"+ line);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			fr.close();
			conn.close();
		}

	}

}
