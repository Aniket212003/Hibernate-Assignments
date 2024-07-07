package com.aniket;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aniket.entities.Student;
import com.aniket.entities.StudentCompositeKey;

public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction txn = session.beginTransaction();
        /*
        StudentCompositeKey ck = new StudentCompositeKey();
        ck.setFname("Aniket");
        ck.setLname("Belgaonkar");
        
        Student ob = new Student();
        ob.setId(ck);
        ob.setCity("Pimple Gurav");
        
        session.save(ob);
        */
        StudentCompositeKey ck = new StudentCompositeKey();
        ck.setFname("Aniket");
        ck.setLname("Belgaonkar");
        Student student = (Student)session.get(Student.class, ck);
        
        System.out.println("City :" + student.getCity());
        
        txn.commit();
        session.close();
        sessionFactory.close();
    }
}
