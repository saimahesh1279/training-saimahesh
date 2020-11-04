public class SumOfFactorials_while 
{
  public static void main(String[] args)
  {
	   int n=123;int fact=1,sum=0;
			   while(n>0)
			   {
				  int rem=n%10;
				  fact=1;
				  while(rem>0)
				  {
					  fact=fact*rem;
					  rem--;
				  }
				  sum=sum+fact;
				  n=n/10;
				 
			   }
			   System.out.println(sum);
  }
}
