public class SumOfDigits_DoWhile 
{
  public static void main(String[] args)
  {
	   
	  int n=123456;
	  int sum = 0;
         do
	  {
		int  reminder= n%10;
		 sum=sum+reminder;
		 n=n/10;
	  }while(n>0);
	  System.out.println(sum);
  }
}
