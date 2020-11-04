public class ReverseNumber_Dowhile 
{
  public static void main(String[] args)
  {
	   int n=123;int x=0;
			  do 
			   {
				  int rem=n%10;
				  x=x*10+rem;
				  n=n/10;
			   }while(n>0);
			   System.out.println(x);
  }
}