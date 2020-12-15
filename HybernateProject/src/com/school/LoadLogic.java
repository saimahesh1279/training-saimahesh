package com.school;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoadLogic {
	public static void main(String[] args) {
		

	Configuration cf=new Configuration();
	cf.configure("configuration.xml");
	SessionFactory sf=cf.buildSessionFactory();
	Session s=sf.openSession();
	Transaction ts=s.beginTransaction();
	Student st=s.load(Student.class, 101);
	st.setAge(23);
	s.save(st);
	ts.commit();
	}
}
