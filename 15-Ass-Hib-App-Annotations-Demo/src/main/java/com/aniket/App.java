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
        configuration.configure();
        //Mapping Student class Using Programmatic Approach
        configuration.addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction txn = session.beginTransaction();
        
        Student ob = new Student();
        
        ob.setName("Aniket");
        ob.setRno(101);
        ob.setPer(69.80);
        
        session.save(ob);
        txn.commit();
        
        session.close();
        sessionFactory.close();
    }
}
