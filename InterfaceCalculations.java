interface Second  {
	public abstract void m4();//or//

	public void m5();//or////we can write in any one of the term .atlast compiler will change the method signature int the first form//
	void m6();
	
		
	}
interface FirstInterface extends Second {
	
public abstract void m1();

public void m2();
void m3();
}
class First implements FirstInterface,Second{

	
	public void m1() {
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
		
	}


	public void m2() {
		int a=10,b=20;
		int c=a-b;
		System.out.println(c);
		
	}

	
	public void m3() {
		int a=10,b=20;
		int c=a*b;
		System.out.println(c);
		
	}

	
	public void m4() {
		int a=10,b=20;
		int c=a/b;
		System.out.println(c);
		
	}


	public void m5() {
		int a=10,b=2;
		int c=a%b;
		System.out.println(c);
		
	}


	public void m6() {
		int a=10,b=20;
		boolean c=a>b;
		System.out.println(c);
		
	}

}
public class InterfaceCalculations {
public static void main(String[] args) {
	First f=new First();
	f.m1();
	System.out.println("========================================");
	f.m2();
	System.out.println("========================================");
	f.m3();
	System.out.println("========================================");
	f.m4();
	System.out.println("========================================");
	f.m5();
	System.out.println("========================================");
	f.m6();
	System.out.println("========================================");
	

}
}