class Car{
 	void cost(){
	System.out.println("cost is 45lakhs");
	NissanSunny dept=new NissanSunny();
	System.out.println("calling from method");
	dept.examPapers();
	}
	
	class NissanSunny{
		void engine(){
		System.out.println("engine model is mj-23123");
		}
	}
}
class MemberInner{
	public static void main(String[] args)
	{
		Car u=new Car();
		u.announcement();
		Car.NissanSunny ud=new Car.NissanSunny();
		ud.examPapers();
	}
}