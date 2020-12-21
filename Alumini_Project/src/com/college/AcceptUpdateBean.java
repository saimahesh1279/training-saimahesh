package com.college;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.Admin;
import com.pojo.AluminiData;
import com.pojo.AluminiUpdate;

public class AcceptUpdateBean {
	
public static boolean acceptUpdate(String id, String company, String designation)
{
	Session se=Configure1.configure();
	Transaction ts=se.beginTransaction();
	Query qe=se.createQuery("update AluminiData a set a.workingcompany=:x,a.designation=:y where a.aid=:z");
	qe.setParameter("x", company);
	qe.setParameter("y", designation);
	qe.setParameter("z", id);
	int a=qe.executeUpdate();
	ts.commit();
	if (a!=0) {	
		return true;
	}

	return false;
	
}
}
