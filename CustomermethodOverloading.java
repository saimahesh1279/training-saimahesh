

class Restaurant
{
	
	void menu()
	{
		System.out.println(".idly 2.Dosa 3.wada 4.poori 5.uthappam");
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
		System.out.println("Order given is "+order1+"  and  "+order2+" "+order3);
	}
	
}

class CustomermethodOverloading
{
  	public static void main(String[] args)
	{
		Restaurant rs=new Restaurant();
		rs.takeOrder("idly");
		rs.takeOrder("Dossa", "uthappam");
		
	}
}