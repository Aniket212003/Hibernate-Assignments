package com.aniket;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aniket.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = null;
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction txn = null;
        try 
        {
        	configuration = new Configuration();
        	configuration.configure();
        	sessionFactory = configuration.buildSessionFactory();
        	session = sessionFactory.openSession();
        	txn = session.beginTransaction();
        	
        	Student student = new Student();
        	
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	System.out.println("Enter Roll no : ");
        	student.setRno(Integer.parseInt(br.readLine()));
        	System.out.println("Enter name : ");
        	student.setName(br.readLine());
        	System.out.println("Enter per : ");
        	student.setPer(Double.parseDouble(br.readLine()));
        	System.out.println("Enter Birth year(e.g 2003) : ");
        	student.setBrithYear(Integer.parseInt(br.readLine()));
            	 
            session.save(student);
            txn.commit();
            
            System.out.println("Student Info :\n");
            System.out.println( student.getRno() + " " + student.getName() + " " + student.getPer() + " " + student.getBrithYear() + " " + student.getAge());
            
        }
        catch(Exception e)
        {
        	txn.rollback();
        }
        finally
        {
        	session.close();
        	sessionFactory.close();
        }

        
    }
}
