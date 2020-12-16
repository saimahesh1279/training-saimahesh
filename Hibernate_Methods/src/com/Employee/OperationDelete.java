package com.Employee;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class OperationDelete {
	public static void delete() throws Exception {
		Session se=Configure1.configure();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice \n 1.Delete All details\n 2. Delete sinlge row");
		int choice=sc.nextInt();
		if(choice==1)
		{
			Transaction ts=se.beginTransaction();
			Query qr=se.createQuery("delete from employee e");
			int a= qr.executeUpdate();
			ts.commit();
			if(a!=1)
			{
				System.out.println("all details are deleted from table");
			}
		}
		else if(choice==2)
		{
			Query qr=se.createQuery("delte from employee e where e.id=?");
			qr.setParameter(0, sc.nextInt());
			
			String option="";
			do {
				Transaction ts=se.beginTransaction();
				int a = qr.executeUpdate();
				ts.commit();
				if (a == 1)
					System.out.println("Record Deleted");
				System.out.println("Do you want to continue (y/n): ");
				option = sc.next();
			}while(option.equalsIgnoreCase("y"));
		}
		se.close();
	}
}