 class Car {
	String model_name;
	int car_width;
	String car_height;
	int car_weight;
	int car_topSpeed;
	int car_CC;
	static String company_name;
	
	 String showroom_location;
}

public class Cars
{
	public static void main(String[] args)
	{
		Car verna=new Car();
		verna. model_name="Verna_petrol";
		verna.car_width=22;
		verna.car_height="4 feet 10 inches";
		verna.car_weight=1000;
		verna.car_topSpeed=160;
		verna.company_name="honda";
		verna.showroom_location="alwal";		
		System.out.println("============car details =============");
		System.out.println("model name is : " +verna. model_name);
		System.out.println("car width  is : " +verna.car_width);
		System.out.println("car height id is : " +verna.car_height);
		System.out.println("car weight is : " +verna.car_weight);
		System.out.println("car company name is : " +verna.company_name);
		System.out.println("car topspeed is : " +verna.car_topSpeed);
		System.out.println("showroom location is : " +verna.showroom_location);




		Car brezza=new Car();
		brezza. model_name="brezza_petrol";
		brezza.car_width=25;
		brezza.car_height="5 feet 10 inches";
		brezza.car_weight=800;
		brezza.car_topSpeed=140;
		brezza.company_name="suzuki";
		brezza.showroom_location="kukatpalli";		
		System.out.println("============car details =============");
		System.out.println("model name is : " +brezza. model_name);
		System.out.println("car width  is : " +brezza.car_width);
		System.out.println("car height id is : " +brezza.car_height);
		System.out.println("car weight is : " +brezza.car_weight);
		System.out.println("car company name is : " +brezza.company_name);
		System.out.println("car topspeed is : " +brezza.car_topSpeed);
		System.out.println("showroom location is : " +brezza.showroom_location);
		
		
		
		
	}
}