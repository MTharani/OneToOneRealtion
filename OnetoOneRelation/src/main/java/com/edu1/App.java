package com.edu1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {

	public static void main(String[] args) 
	{
		Laptop l=new Laptop();
		l.setLid(1);
		l.setLname("dell");
		
		Student s=new Student();
		s.setRollno(11);
		s.setName("dhivya");
		s.setMark(99);
		s.setLp(l);
	    Configuration conn=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
	    ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
	    SessionFactory sf=conn.buildSessionFactory(reg);
	    Session sess=sf.openSession();
	    Transaction tx=sess.beginTransaction();
	    sess.save(l);
	    sess.save(s);
	    tx.commit();

	}

}
