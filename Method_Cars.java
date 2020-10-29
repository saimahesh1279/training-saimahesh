 class Car {
	String model_name;
	int car_width;
	String car_height;
	int car_weight;
	int car_topSpeed;
	int car_CC;
	static String company_name;
	
	
	
	String showroom_location;
	 void display()
	 {
		 System.out.println("============car details =============");
			System.out.println("model name is : " + model_name);
			System.out.println("car width  is : " +car_width);
			System.out.println("car height id is : " +car_height);
			System.out.println("car weight is : " +car_weight);
			System.out.println("car company name is : " +company_name);
			System.out.println("car topspeed is : " +car_topSpeed);
			System.out.println("showroom location is : " +showroom_location);
	 }
}

public class Method_Cars
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
		
          verna.display();



		Car brezza=new Car();
		brezza. model_name="brezza_petrol";
		brezza.car_width=25;
		brezza.car_height="5 feet 10 inches";
		brezza.car_weight=800;
		brezza.car_topSpeed=140;
		brezza.company_name="suzuki";
		brezza.showroom_location="kukatpalli";		
		
		brezza.display();
		
		
	}
}