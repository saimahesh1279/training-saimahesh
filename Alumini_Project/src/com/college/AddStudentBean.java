package com.college;

import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.pojo.Student;

public class AddStudentBean {
public static boolean addStudent(String id, String name, String email, String password, int presentyr, String department, Long mobile, String address)
{
	
	Session se=Configure1.configure();
	Transaction ts=se.beginTransaction();
	Student as=new Student();
	   as.setSid(id);
	    as.setSname(name);;
	    as.setSemail(email);
	    as.setSpassword(password);
	    as.setPresentyr(presentyr);
	    as.setDepartment(department);
	    as.setMobileno(mobile);
	    as.setAddress(address);
	    Serializable s=se.save(as);
	ts.commit();
	if(s.hashCode()>0) {
	    return true;
	}
	return false;
	
}
}
