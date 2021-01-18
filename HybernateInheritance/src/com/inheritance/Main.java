package com.inheritance;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	Configuration cf=new Configuration();
	cf.configure("configuration.xml");
	SessionFactory sf=cf.buildSessionFactory();
	Session se=sf.openSession();
	Transaction ts=se.beginTransaction();
	CreditCard c=new CreditCard();
	c.setPaymentId(101);
	c.setAmount(20000);
	c.setCardType("Visa");
	
	se.save(c);
	ts.commit();
}
}
