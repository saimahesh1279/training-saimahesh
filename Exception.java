public class Exception
{
public static void main(String args[])
{
int array[]={10,10,30};
int n1=25,n2=10;
int result=10;
try
{
result=n1/n2;
System.out.println("the result is"+result);
for(int i=4;i>=0;i--)
{
System.out.println("value of array is"+array[i]);
}
}
catch(ArrayIndexOutOfBoundException e)
{
System.out.println("Array is out of bound"+e);

}
catch(ArithmeticException e)
{
System.out.println("cannot be divided by zero"+e);
}
}
}