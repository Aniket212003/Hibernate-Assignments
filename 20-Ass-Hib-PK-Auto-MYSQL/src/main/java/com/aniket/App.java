package com.aniket;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aniket.entites.Student;



public class App {

	public static void main(String[] args) 
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction txn = session.beginTransaction();
		
		Student student = new Student();
		student.setName("Aniket");
		student.setPer(69.80);
		student.setCity("Pune");
		
		session.save(student);
		txn.commit();
		
		session.close();
		sessionFactory.close();
	}

}
