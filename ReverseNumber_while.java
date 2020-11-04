public class ReverseNumber_while 
{
  public static void main(String[] args)
  {
	   int n=123;int x=0;
			   while(n>0)
			   {
				  int rem=n%10;
				  x=x*10+rem;
				  n=n/10;
			   }
			   System.out.println(x);
  }
}