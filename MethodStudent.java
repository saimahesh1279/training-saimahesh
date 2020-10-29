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


void display()
{

		System.out.println("============Student details =============");
		System.out.println("student name is : " +student_name);
		System.out.println("student age is : " +student_age);
		System.out.println("student id is : " +student_id);
		System.out.println("student address is : " +student_address);
		System.out.println("student height is : " +student_height);
		System.out.println("student weight is : " +student_weight);
		System.out.println("department name is : " +department);
		System.out.println("department HOD name is : " +department_HOD);
		System.out.println("college name is : " +college_name);
		
}
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


	void display()
{
	System.out.println("===========employee details=================");
		System.out.println("employee name is:"+employee_name);
		System.out.println("employee id is:"+empoyee_id);
		System.out.println("employee address is:"+employee_address);
		System.out.println("employee designation is:"+employee_designation);
		System.out.println("employee salary is:"+salary);
		System.out.println("number of employees in company is:"+company_strength);
		System.out.println("company location  is:"+company_location);
		System.out.println("company name is:"+companyName);

}
}
public class MethodStudent
{
	public static void main(String[] args)
	{
		Student mahesh=new Student();
		mahesh.student_id=154811279;
		mahesh.student_age=22;
		mahesh.student_height="5 feet 10 inches";
		mahesh.student_name="mahesh";
		mahesh.student_address="hyderabad";
		mahesh.student_weight=80;
		mahesh.department="information technology";
		mahesh.failed_subject_name="M2";
		mahesh.department_HOD="rahul";
		mahesh.college_name="gdlv";
		

		mahesh.display();
		
		Employee sai=new Employee();
		sai.empoyee_id=56465646;
		sai.employee_name="sai";
		sai.employee_designation="software devloper";
		sai.employee_address="hyderabad";
		sai.salary=20000;
		sai.company_strength=300;
		sai.company_location="kondapur";
		sai.companyName="motivitylabs";
		
		sai.display();
		
	}
}