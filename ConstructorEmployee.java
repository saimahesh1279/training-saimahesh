class Employee
{
	int empid;
	String empname;
	int salary;
	String address;
	String empDesignation;
	String empHeight;
	int empWeight;
	String companyName;
	String companyLocation;
	Employee(int empid,String empname,int salary,String address,String empDesignation,String empHeight,int empWeight,String companyName,String companyLocation)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		this.address=address;
		this.empDesignation=empDesignation;
		this.empHeight=empHeight;
		this.empWeight=empWeight;
		this.companyName=companyName;
		this.companyLocation=companyLocation;
	}

	void display()
	{
		System.out.println("Employee id is :"+empid);
		System.out.println("Employee name is :"+empname);
		System.out.println("Employee salary is :"+salary);
		System.out.println("Employee address is : "+address);
		System.out.println("Employee designation  is :"+empDesignation);
		System.out.println("Employee weight is :"+empWeight);
		System.out.println("company name is :"+companyName);
		System.out.println("company location is :"+companyLocation);
	
	}
 }
	public class ConstructorEmployee
	{
		public static void main(String[] args)
		{
			Employee mahesh=new Employee(1254,"mahesh",23000,"hyd","devloper","5foot11inches",80,"motivitylabs","hydearabad");
				mahesh.display();	
		}
	}
