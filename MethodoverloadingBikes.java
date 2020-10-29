class BikeShowroom
{
	
	void menu()
	{
		System.out.println(".mt15 2.fz25 3.yamah rey 4.fz 5.mt03");
	}
	
	void takeOrder(String order)
	{
		System.out.println("Order given is "+ order);
	}
	void takeOrder(String order1,String order2)
	{
		System.out.println("Order given is "+ order1+"and"+order2);
	}
	void takeOrder(String order1,String order2,String order3)
	{
		System.out.println("Order given is "+  order1+"and"+order2+" "+order3);
	}
	
}

public class MethodoverloadingBikes
{
  	public static void main(String[] args)
	{
		BikeShowroom rs=new BikeShowroom();
		rs.menu();
		rs.takeOrder("mt15");
		rs.takeOrder("fzs", "mt15");
		
	}
}