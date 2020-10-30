public class A
{
	int a=10;
	int b=20;
}
public class B extends A
{
	int c=10;
	int d=40;
}
public class SingleCalculation
{
	public static void main(String[] args)
	{
		B x=new B();
		int result= x.a+x.b-x.c*x.d;
		System.out.println("THe result is :"+result);
	}
	
}