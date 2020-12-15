package com.school;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetLogic {
	public static void main(String[] args) {
		

	Configuration cf=new Configuration();
	cf.configure("configuration.xml");
	SessionFactory sf=cf.buildSessionFactory();
	Session s=sf.openSession();
	Transaction ts=s.beginTransaction();
	Student st=s.get(Student.class, 104);
	System.out.println(st.getId()+"  "+st.getName()+"  "+st.getMarks()+"  "+st.getGender()+"  "+st.getSection()+"  "+st.getAge()+"  "+st.getAddress());
	st=(Student)s.get("com.school.Student", 102);
	System.out.println(st.getId()+"  "+st.getName()+"  "+st.getMarks()+"  "+st.getGender()+"  "+st.getSection()+"  "+st.getAge()+"  "+st.getAddress());
	s.save(st);
	}
}
