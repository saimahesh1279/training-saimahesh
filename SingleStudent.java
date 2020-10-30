 class Department
{
	String deptName="IT";
	String hodName="sridhar";
}
class Student extends Department
{
	String stdName="mahesh";
	String stdyr="1st";
	String stdAddress="hyderabad";
}
public class SingleStudent
{
	public static void main(String[] args)
	{
		Student s=new Student();
		System.out.println("student name is"+s.stdName);
		System.out.println("student year is"+s.stdyr);
   		System.out.println("student address is"+s.stdAddress);
		System.out.println("department name is"+s.deptName);
		System.out.println("department HOD is"+s.hodName);
	}
	
}