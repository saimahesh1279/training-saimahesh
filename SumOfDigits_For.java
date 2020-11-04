public class SumOfDigits_For 
{
  public static void main(String[] args)
  {
	   
	  int n=123456;
	  int sum = 0;
        for(;n>0; n=n/10)
	  {
		int  reminder= n%10;
		 sum=sum+reminder;
		
	  }
	  System.out.println(sum);
  }
}
