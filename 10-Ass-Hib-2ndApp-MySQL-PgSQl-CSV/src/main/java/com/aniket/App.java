package com.aniket;

import java.io.BufferedReader;
import java.io.FileReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aniket.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	 SessionFactory sessionFactoryMysql= null;
    	 SessionFactory sessionFactoryPgsql=null;
    	 Session sessionMysql=null;
    	 Session sessionPgsql=null;
    	 Transaction transactionMysql = null;
		 Transaction transactionPgsql = null;
    	 FileReader fileReader = null;
    	 BufferedReader br = null;
    	
    	try 
    	{
    	 Configuration configurationMysql = new Configuration();
    	 Configuration configurationPgsql = new Configuration();
    	 configurationMysql.configure("/hibernate_MYSQL.cfg.xml");// load and parse cfg.xml file
    	 configurationPgsql.configure("/hibernate_PGSQL.cfg.xml");// load and parse cfg.xml file
    	 
    	 sessionFactoryMysql = configurationMysql.buildSessionFactory();
    	 sessionFactoryPgsql = configurationPgsql.buildSessionFactory();
        
    	 sessionMysql = sessionFactoryMysql.openSession();
         sessionPgsql = sessionFactoryPgsql.openSession();
    	 
         fileReader = new FileReader("src/main/resource/Student.csv");
         br = new BufferedReader(fileReader);
         
         transactionMysql = sessionMysql.beginTransaction();
		 transactionPgsql = sessionPgsql.beginTransaction();
		 
		 
         
		 while(true)
         {
        	 String line = br.readLine();
        	 if(line==null)
        	 {
        		 break;
        	 }
        	 String tok[]=line.split(",");
        	 try 
        	 {
        		 Student Sob = new Student();
        		 Sob.setRno(Integer.parseInt(tok[0]));
        		 Sob.setName(tok[1]);
        		 Sob.setPer(Double.parseDouble(tok[2]));
        		 
        		 sessionMysql.save(Sob);
        		 sessionPgsql.save(Sob);
        		 System.out.println(tok[0]+"\t"+tok[1]+"\t"+tok[2]);
        	 }
        	 catch(Exception e )
             	 {
        		 e.printStackTrace();
        	 }
         }
         transactionMysql.commit();
		 transactionPgsql.commit();
    
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		 sessionMysql.close();
        	 sessionPgsql.close();
        	 sessionFactoryMysql.close();
        	 sessionFactoryPgsql.close();
    	}
    }
}
