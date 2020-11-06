public class Finally
{
public static void main(String args[])
{
try
{
int data=200/20;
}
catch(ArithmeticException e)
{
e.printStackTrace();
}
finally
{
System.out.println("execute finally block");
}
}
}