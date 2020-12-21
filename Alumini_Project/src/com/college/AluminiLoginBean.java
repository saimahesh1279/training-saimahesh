package com.college;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.query.Query;

import com.pojo.AluminiData;

public class AluminiLoginBean {
public static AluminiData aluminiLogin(String id,String password)
{
	Session se=Configure1.configure();
	Transaction ts= se.beginTransaction();
	Query qe=se.createQuery("from AluminiData a where a.aid=:x and a.password=:y");
	qe.setParameter("x", id);
	qe.setParameter("y", password);
	List<AluminiData> l=qe.list();
	ts.commit();
	if(!l.isEmpty())
	{
		return l.get(0);
	}
	return null;
	
}
}
