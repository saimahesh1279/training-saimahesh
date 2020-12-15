package com.school;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdateLogic {
public static void main(String[] args) {
	Configuration cg=new Configuration();
	cg.configure("configuration.xml");
	SessionFactory sf=cg.buildSessionFactory();
	Session s=sf.openSession();
			Student mahesh=new Student();
			mahesh.setId(104);
			mahesh.setName("lavanya");
			mahesh.setMarks(930);
			mahesh.setGender("Female");
			mahesh.setSection("section B");
			mahesh.setAge(22);
			mahesh.setAddress("Vijayawada");
			Transaction ts=s.beginTransaction(); 
				s.saveOrUpdate(mahesh);
				ts.commit();
				s.close();
				sf.close();
}
}
