class University{
 	void announcement(){
 		System.out.println("exam starts from dec 21st");
 		class Department{
 			void examPapers(){
 			System.out.println("Exam papers are being prepared");
 			}
 		}
	
	Department dept=new Department();
	System.out.println("calling from method");
	dept.examPapers();
	}
	
	
}
class LocalInner{
	public static void main(String[] args)
	{
		Univercity u=new University();
		u.announcement();
		Univercity.Department ud=new Univercity.Department();
		ud.examPapers();
	}
}