package com.college;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Feedback;

public class FeedbackBean {
	public static boolean saveFeedback(Feedback f) {
		Session se=Configure1.configure();
		Transaction ts=se.beginTransaction();
		Serializable s=se.save(f);
		ts.commit();
		if(s!=null) {
		    return true;
		}
		return false;
		
	}
}
