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
	

	String servedFood()
	{
		return "Wada";
	}
	int giveBill()
		{
			return 400;
		}
	String payment(int amount)
	{
		return "paid";
	}

}

class CustomerMethod
{
  	public static void main(String[] args)
	{
		Restaurant rs=new Restaurant();
		rs.menu();
		rs.takeOrder("Wada");
		System.out.println("Food served is:"+rs.servedFood());
		System.out.println("Bill is:"+rs.giveBill());
		System.out.println("Bill  is:"+rs.payment(400));
	}
}