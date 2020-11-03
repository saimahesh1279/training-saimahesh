class Car{
 	void announcements(){
	System.out.println("exams gonna start from 11 dec");
	Department dept=new Department();
	System.out.println("calling from method");
	dept.examPapers();
	}
	
	class NissanSunny{
		void examPapers(){
		System.out.println("Exam papers are being prepared");
		}
	}
}
class MemberInner{
	public static void main(String[] args)
	{
		Univercity u=new University();
		u.announcement();
		Univercity.Department ud=new Univercity.Department();
		ud.examPapers();
	}
}