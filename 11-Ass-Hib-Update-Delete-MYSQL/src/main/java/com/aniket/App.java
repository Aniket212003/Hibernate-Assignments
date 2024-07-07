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
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        Student ob = new Student();
        Student ob1 = new Student();
        Student ob2 = new Student();
        
        ob.setRno(102);
        ob.setName("Aniket");
        ob.setPer(70.80);
        
        ob1.setRno(104);
        ob1.setName("Nikhil");
        ob1.setPer(81.40);
        
        ob2.setRno(105);
        
        
        session.update(ob);
        session.saveOrUpdate(ob1);
        session.delete(ob2);
        
        
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
