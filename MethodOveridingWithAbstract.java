abstract class Car{
	abstract void cost();
	abstract void milage();
	abstract void cc();
		void start()
		{
			System.out.println("Starts with a key");
		}
		
}
class Benz extends Car
{
	void cost()
	{
		System.out.println("car cost is 90lakhs");
	}
	void milage()
	{
		System.out.println("car milage is 10kmpl");
	}
	void cc()
	{
		System.out.println("car cc is 2000");
	}
}
class Bmw extends Car
{
	void cost()
	{
		System.out.println("car cost is 85lakhs");
	}
	void milage()
	{
		System.out.println("car milage is 8kmpl");
	}
	void cc()
	{
		System.out.println("car cc is 5000");
	}
}
class MethodOveridingWithAbstract
{
	public static void main(String[] args)
	{
		Car c=new Benz();
		c.start();
		c.cost();
		c.milage();
		c.cc();
		
		
		c=new Bmw();
		c.start();
		c.cost();
		c.milage();
		c.cc();
		
		
	}
}

