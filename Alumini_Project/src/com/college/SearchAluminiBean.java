package com.college;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.AluminiData;

public class SearchAluminiBean {
public static AluminiData searchAlumini(String id)
{
	Session se=Configure1.configure();
	Transaction te=se.beginTransaction();
	Query qe=se.createQuery("from AluminiData a where a.aid=:x");
	qe.setParameter("x", id);
	List<AluminiData> l=qe.list();
	AluminiData ad=null;
	Iterator<AluminiData> i=l.iterator();
	while(i.hasNext())
	{
		ad=i.next();
		return ad;
	}
	
	return null;
	
}
}
