package com.aniket;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aniket.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       Configuration configuration = new Configuration();
       configuration.configure(); // load and parse cfg.xml file
       
       SessionFactory sessionFactory = configuration.buildSessionFactory();
       Session session = sessionFactory.openSession();
       
       Student Sob = new Student();
       
       Sob.setRno(101);
       Sob.setName("Aniket");
       Sob.setPer(70.1);
       
       Transaction transaction = session.beginTransaction();
       
       session.save(Sob);
       transaction.commit();
       
       session.close();
       sessionFactory.close();
       
       System.out.println("Hibernate First App !!");
    }
}
