public class SumOfDigits_While 
{
  public static void main(String[] args)
  {
	   
	  int n=123456;
	  int sum = 0;
         while(n>0)
	  {
		int  reminder= n%10;
		 sum=sum+reminder;
		 n=n/10;
	  }
	  System.out.println(sum);
  }
}
