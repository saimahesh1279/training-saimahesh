class ElectroincShop{
	void menu()
	{
		System.out.println("1.AMD 2.Intel 3.rams 4.Graphic cards 5.motherboard  6.smps");
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
public class MethodOverloadingComputer
{
  	public static void main(String[] args)
	{
		ElectronicShop es=new ElectronicShop();
		es.menu();
		es.takeOrder("ram");
		es.takeOrder("ram", "Grafic cards");
		
	}
}