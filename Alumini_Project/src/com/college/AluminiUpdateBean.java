package com.college;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.AluminiUpdate;

public class AluminiUpdateBean {
	public static AluminiUpdate getById(String id) {
		Session se = Configure1.configure();
		Transaction ts = se.beginTransaction();
		Query qe = se.createQuery("from AluminiUpdate a where a.aid=:x");
		qe.setParameter("x", id);
		List<AluminiUpdate> li = qe.list();
		Iterator<AluminiUpdate> i = li.iterator();
		ts.commit();
		if (i.hasNext()) {
			return i.next();
		}
		return null;
	}

	public static boolean aluminiUpdate(String id, String working_company, String designation) {
		Session se = Configure1.configure();
		Transaction ts = se.beginTransaction();
		AluminiUpdate au = new AluminiUpdate();
		au.setAid(id);
		au.setWorking_company(working_company);
		au.setDesignation(designation);
		Serializable s = se.save(au);
		ts.commit();
		if (s.hashCode() > 0) {
			return true;
		}
		return false;

	}
}
