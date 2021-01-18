package com.inheritace2;

import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class Main {
public static void main(String[] args) {
	Configuration cf=new Configuration();
	cf.configure("configuration2.xml");
	SessionFactory sf=cf.buildSessionFactory();
	Session se=sf.openSession();
	 org.hibernate.Transaction  ts=se.beginTransaction();

	CreditCard c=new CreditCard();
	c.setPaymentId(101);
	c.setAmount(20000);
	c.setCardType("Visa");
	
	
	Cheque cq=new Cheque();
	cq.setPaymentId(102);
	cq.setAmount(25000);
	cq.setChequeType("icici");
	se.save(c);
	se.save(cq);
	ts.commit();
	
}
}
