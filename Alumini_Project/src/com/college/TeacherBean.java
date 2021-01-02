package com.college;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.Teacher;

public class TeacherBean {
	public static List<Teacher> getTeacher(){
		Session se=Configure1.configure();
		Transaction ts=se.beginTransaction();
		Query qe=se.createQuery("from Teacher t");
		List<Teacher> t=qe.list();
		ts.commit();
		if(t!=null) {
			return t;
		}
		return null;
	}
	
	public static Teacher getTeacherById(int id) {
		Session se=Configure1.configure();
		Transaction ts=se.beginTransaction();
		Teacher t=(Teacher)se.load("com.pojo.Teacher", id);
		ts.commit();
		if(t!=null) {
			return t;
		}
		return null;
	}
}
