 abstract class Btech {
public abstract void firstyear();
public abstract void  secondYear();
public  abstract void thirdYear();
public abstract void forthYear();
}
class ECE extends Btech {

	
	public void firstyear() {
		System.out.println("sub1");
		System.out.println("sub2");
		System.out.println("sub3");
		System.out.println("sub4");
		System.out.println("sub5");
		System.out.println("sub6");
		
	}

	
	public void secondYear() {
		System.out.println("sub1");
		System.out.println("sub2");
		System.out.println("sub3");
		System.out.println("sub4");
		System.out.println("sub5");
	
		
	}

	
	public void thirdYear() {
		System.out.println("sub1");
		System.out.println("sub2");
		System.out.println("sub3");
		System.out.println("sub4");
		
		
	}

	
	public void forthYear() {
		System.out.println("sub1");
		System.out.println("sub2");
		System.out.println("sub3");
		
		
	}
	

}

 class CSE extends Btech {
	
	public void firstyear() {
		System.out.println("sub1");
		System.out.println("sub2");
		System.out.println("sub3");
		System.out.println("sub4");
		System.out.println("sub5");
		System.out.println("sub6");
		
	}

	
	public void secondYear() {
		System.out.println("sub1");
		System.out.println("sub2");
		System.out.println("sub3");
		System.out.println("sub4");
		System.out.println("sub5");
	
		
	}

	
	public void thirdYear() {
		System.out.println("sub1");
		System.out.println("sub2");
		System.out.println("sub3");
		System.out.println("sub4");
		
		
	}

	public void forthYear() {
		System.out.println("sub1");
		System.out.println("sub2");
		System.out.println("sub3");
		
		
	}
}
class IT extends Btech{
	
	public void firstyear() {
		System.out.println("sub1");
		System.out.println("sub2");
		System.out.println("sub3");
		System.out.println("sub4");
		System.out.println("sub5");
		System.out.println("sub6");
		
	}

	public void secondYear() {
		System.out.println("sub1");
		System.out.println("sub2");
		System.out.println("sub3");
		System.out.println("sub4");
		System.out.println("sub5");
	
		
	}

	public void thirdYear() {
		System.out.println("sub1");
		System.out.println("sub2");
		System.out.println("sub3");
		System.out.println("sub4");
		
		
	}

	public void forthYear() {
		System.out.println("sub1");
		System.out.println("sub2");
		System.out.println("sub3");
		
		
	}
}
public class AbstractStudent  {
	public static void main(String[] args) {
		ECE e=new ECE();
		
		

		System.out.println("==================ECE========================");
		System.out.println("==================first yr========================");
		e.firstyear();

		System.out.println("===================second yr=======================");
		e.secondYear();

		System.out.println("====================3rd yr======================");
		e.thirdYear();
		
		System.out.println("=====================4th yr=====================");
		e.forthYear();

		CSE s=new CSE();

		System.out.println("====================CSE======================");
		System.out.println("====================1st yr======================");
		s.firstyear();

		System.out.println("=====================2nd yr=====================");
		s.secondYear();

		System.out.println("====================3rd yr======================");
		s.thirdYear();

		System.out.println("=====================4th yr=====================");
		s.forthYear();

		IT i= new IT();
		System.out.println("==================IT========================");
		System.out.println("======================1st yr====================");
		i.firstyear();

		System.out.println("====================2nd yr======================");
		i.secondYear();

		System.out.println("====================3rd yr======================");
		i.thirdYear();

		System.out.println("====================4th yr======================");
		i.forthYear();

	}

}
