package com.school;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MergeLogic {
	public static void main(String[] args) {
		Configuration cg=new Configuration();
		cg.configure("configuration.xml");
		SessionFactory sf=cg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction ts=s.beginTransaction(); 
				Student st=new Student();
				st.setId(102);
				st.setMarks(600);
				st.setAge(21);
				st.setSection("section c");
				st=(Student)s.merge(st);
				ts.commit();
				s.close();
				sf.close();
	}
}
