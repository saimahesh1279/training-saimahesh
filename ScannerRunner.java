import java.util.*;
class Student {
	int student_id;
	int student_age;
	String student_name;
	String student_address;
	String student_height;
	int student_weight;
	static String department;
	static String college_name;
	 String failed_subject_name;
	static String department_HOD;
}
 class Employee
{
	int empoyee_id;
	String employee_name;
	int salary;
	String employee_address;
	String employee_designation;
	static String companyName;
	static String company_location;
	static int company_strength;
}
public class ScannerRunner
{
	public static void main(String[] args)
	{
		Student mahesh=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id: ");
		mahesh.student_id=sc.nextInt();
		System.out.println("enter student age: ");
		mahesh.student_age=sc.nextInt();
		System.out.println("enter student height: ");
		mahesh.student_height=sc.next();
		System.out.println("enter student name: ");
		mahesh.student_name=sc.next();
		System.out.println("enter student address: ");
		mahesh.student_address=sc.next();
		System.out.println("enter student weight: ");
		mahesh.student_weight=sc.nextInt();
		System.out.println("enter department: ");
		mahesh.department=sc.next();
		System.out.println("enter failed subject name: ");
		mahesh.failed_subject_name=sc.next();
		System.out.println("enter HOD name : ");
		mahesh.department_HOD=sc.next();
		System.out.println("enter college name: ");
		mahesh.college_name=sc.next();
		System.out.println("============Student details =============");
		System.out.println("student name is : " +mahesh.student_name);
		System.out.println("student age is : " +mahesh.student_age);
		System.out.println("student id is : " +mahesh.student_id);
		System.out.println("student address is : " +mahesh.student_address);
		System.out.println("student height is : " +mahesh.student_height);
		System.out.println("student weight is : " +mahesh.student_weight);
		System.out.println("department name is : " +mahesh.department);
		System.out.println("department HOD name is : " +mahesh.department_HOD);
		System.out.println("college name is : " +mahesh.college_name);
		
		
		Employee sai=new Employee();
		System.out.println("enter the employee id: ");
		sai.empoyee_id=sc.nextInt();
		System.out.println("enter the employee name: ");
		sai.employee_name=sc.next();
		System.out.println("enter the employee designation: ");
		sai.employee_designation=sc.next();
		System.out.println("enter the employee address: ");
		sai.employee_address=sc.next();
		System.out.println("enter the employee salary: ");
		sai.salary=sc.nextInt();
		System.out.println("enter the companies strength: ");
		sai.company_strength=sc.nextInt();
		System.out.println("enter the company location: ");
		sai.company_location=sc.next();
		System.out.println("enter the company name: ");
		sai.companyName=sc.next();
		System.out.println("===========employee details=================");
		System.out.println("employee name is:"+sai.employee_name);
		System.out.println("employee id is:"+sai.empoyee_id);
		System.out.println("employee address is:"+sai.employee_address);
		System.out.println("employee designation is:"+sai.employee_designation);
		System.out.println("employee salary is:"+sai.salary);
		System.out.println("number of employees in company is:"+sai.company_strength);
		System.out.println("company location  is:"+sai.company_location);
		System.out.println("company name is:"+sai.companyName);
		
		
	}
}