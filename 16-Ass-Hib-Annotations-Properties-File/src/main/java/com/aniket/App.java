package com.aniket;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aniket.entities.Student;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Configuration configuration = new Configuration();
           
 		/*
		 FileInputStream fis = new FileInputStream("src/main/resources/myconfig.properties");
		 Properties prop = new Properties(); prop.load(fis);
		   
		 configuration.setProperties(prop);
		 */
        
        //programtic approach
        
		/*
		 * configuration.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
		 * configuration.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/hfdb");
		 * configuration.setProperty("hibernate.connection.user","root");
		 * configuration.setProperty("hibernate.connection.password","Aniket");
		 * 
		 * configuration.setProperty("hibernate.dialect" , "org.hibernate.dialect.MySQL5Dialect");
		 * configuration.setProperty("hibernate.show_sql","true");
		 * configuration.setProperty("hibernate.hbm2ddl.auto","create");
		 * configuration.setProperty("hibernate.format_sql","false");
		 */
        configuration.addAnnotatedClass(Student.class);
        //configuration.addResource("Student.hbm.xml"); --> if hbm.xml file exists
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction txn = session.beginTransaction();
        
        Student ob = new Student();
        
        ob.setRno(101);
        ob.setName("Aniket");
        ob.setPer(70.80);
        
        session.save(ob);
        txn.commit();
        
        session.close();
        sessionFactory.close();
        
    }
}
