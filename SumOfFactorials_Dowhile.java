public class SumOfFactorials_Dowhile 
{
  public static void main(String[] args)
  {
	   int n=123;int fact=1,sum=0;
			   
			   do{
				  int rem=n%10;
				  fact=1;
				  
				  do{
					  fact=fact*rem;
					  rem--;
				  }while(rem>0);
				  sum=sum+fact;
				  n=n/10;
				 
			   }while(n>0);
			   System.out.println(sum);
  }
}