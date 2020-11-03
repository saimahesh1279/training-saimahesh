class Car{
 	void cost(){
 		System.out.println("car cost is 50lakhs");
 		class NissanSunny{
 			void engine(){
 			System.out.println("Engine is powerfull");
 			}
 		}
	
	NissanSunny dept=new NissanSunny();
	System.out.println("calling from method");
	dept.engine();
	}
	
	
}
class LocalInner{
	public static void main(String[] args)
	{
		Univercity u=new University();
		u.announcement();
		Univercity.NissanSunny ud=new Univercity.NissanSunny();
		ud.engine();
	}
}