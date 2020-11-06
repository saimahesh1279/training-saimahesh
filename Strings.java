class Strings
{
public static void main(String args[])
{
String str1=new String("Hyderabad");
String str2=new String("chennai");
String str3=new String("Hyderabad");
System.out.println("str1 equals to str2:"+str1.equalsIgnoreCase(str2));
System.out.println("str1 equals to str3:"+str1.equalsIgnoreCase(str3));
System.out.println("str1 equals to canada:"+str1.equalsIgnoreCase("canada"));
System.out.println("str1 equals to str2:"+str1.equalsIgnoreCase("Hyderabad"));
System.out.println("str2 equals to str2:"+str1.equalsIgnoreCase("mango));

}
}



