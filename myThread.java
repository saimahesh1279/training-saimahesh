
 class A extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("i value is :"+i);
		}
	}
}
public class myThread{

	public static void main(String[] args) {
		A s=new A();
		s.start();
		for(int x=0;x<20;x++)
		{
			System.out.println("x value is :"+x);
		}
		

	}

}

