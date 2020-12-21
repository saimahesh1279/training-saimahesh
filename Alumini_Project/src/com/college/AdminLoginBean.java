package com.college;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.Admin;

public class AdminLoginBean {

	public static boolean login(String id, String password) throws Exception {
		Session se = Configure1.configure();
		Transaction ts = se.beginTransaction();
		Query qe = se.createQuery("from Admin a where a.id=:x and a.password=:y");
		qe.setParameter("x", id);
		qe.setParameter("y", password);
		List<Admin> li = qe.list();
		ts.commit();
		if (!li.isEmpty()) {
			return true;
		}
		return false;

	}
}
