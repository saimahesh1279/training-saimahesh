package com.school;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteLogic {
	public static void main(String[] args) {
		

		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session s=sf.openSession();
		Transaction ts=s.beginTransaction();
		Student st=s.get(Student.class, 102);
		s.delete(st);
		
	}
}
