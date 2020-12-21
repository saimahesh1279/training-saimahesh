package com.college;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.AluminiData;

public class AddAluminiBean {

	public static boolean addAlumini(String id, String name, String password, String department, int passedoutyr,
			long mobile, String address, int percentage, String workingcompany, String designation) {
		Session se=Configure1.configure();
		Transaction ts=se.beginTransaction();
		AluminiData ad= new AluminiData();
		ad.setAid(id);
		ad.setStdname(name);
		ad.setPassword(password);
		ad.setDepartment(department);
		ad.setPassedoutyr(passedoutyr);
		ad.setMobile(mobile);
		ad.setAddress(address);
		ad.setPercentage(percentage);
		ad.setWorkingcompany(workingcompany);
		ad.setDesignation(designation);
		Object ob=se.save(ad);
		ts.commit();
		if(ob!=null)
		{
			return true;
		}
		return false;
	}

}
