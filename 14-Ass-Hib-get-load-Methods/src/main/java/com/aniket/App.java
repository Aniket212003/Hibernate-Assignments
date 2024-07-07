package com.aniket;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aniket.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        int rid = 115;
        try 
        {
        	Student ob = (Student)session.load(Student.class, rid);
        
        	System.out.println("Student Roll No    : " + ob.getRno());
        	System.out.println("Student Name       : " + ob.getName());
        	System.out.println("Student Percentage : " + ob.getPer());
        	System.out.println("Student Address    : " + ob.getAddr());
        	System.out.println("Student Birthday   : " + ob.getBday());
        }
        catch(ObjectNotFoundException onfe)
        {
        	System.out.println("Record Not Found For Rno : " + rid );
        }
//        Student ob = (Student) session.get(Student.class, 101);
//        
//        System.out.println("Student Roll No    : " + ob.getRno());
//        System.out.println("Student Name       : " + ob.getName());
//        System.out.println("Student Percentage : " + ob.getPer());
//        System.out.println("Student Address    : " + ob.getAddr());
//        System.out.println("Student Birthday   : " + ob.getBday());
        
        session.close();
        sessionFactory.close();
    }
}
