package com.college;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.Admin;
import com.pojo.Student;



public class StudentLoginBean {
public static Student login(String id,String password)
{
	Session se = Configure1.configure();
	Transaction ts = se.beginTransaction();
	Query qe=se.createQuery("from Student s where s.sid=:x and s.spassword=:y");
	qe.setParameter("x", id);
	qe.setParameter("y", password);
	List<Student> li = qe.list();
	ts.commit();
	if (!li.isEmpty()) {
		return li.get(0);
	}
	return null;

}
}

