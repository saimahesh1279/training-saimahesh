public class Exception2
{
public static void main(String args[])
{
String s=null;
try
{
System.out.println(s.length());
}
catch(NullPonterException e)
{
e.printStackTrace();
}
}