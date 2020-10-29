 class Car {
	String model_name;
	int car_width;
	String car_height;
	int car_weight;
	int car_topSpeed;
	int car_CC;
	static String company_name;
	
	 String showroom_location;

	public Car(String model_name, int car_width, String car_height, int car_weight, int car_topSpeed, int car_CC, String company_name,
			String showroom_location) {
		
		this.model_name = model_name;
		this.car_width = car_width;
		this.car_height = car_height;
		this.car_weight = car_weight;
		this.car_topSpeed = car_topSpeed;
		this.car_CC = car_CC;
		this.showroom_location = showroom_location;
	}
	 
}

public class ConstructorCars
{
	public static void main(String[] args)
	{
		Car verna=new Car("Verna_petrol",22,"4 feet 10 inches",1000,160,1700,"honda","alwal");
				
		System.out.println("============car details =============");
		System.out.println("model name is : " +verna. model_name);
		System.out.println("car width  is : " +verna.car_width);
		System.out.println("car height id is : " +verna.car_height);
		System.out.println("car weight is : " +verna.car_weight);
		System.out.println("car company name is : " +verna.company_name);
		System.out.println("car topspeed is : " +verna.car_topSpeed);
		System.out.println("car cc is : " +verna.car_CC);
		System.out.println("showroom location is : " +verna.showroom_location);




		Car brezza=new Car("brezza_petrol",25,"5 feet 10 inches",800,140,600,"suzuki","kukatpalli");
		
		System.out.println("============car details =============");
		System.out.println("model name is : " +brezza. model_name);
		System.out.println("car width  is : " +brezza.car_width);
		System.out.println("car height id is : " +brezza.car_height);
		System.out.println("car weight is : " +brezza.car_weight);
		System.out.println("car company name is : " +brezza.company_name);
		System.out.println("car topspeed is : " +brezza.car_topSpeed);
		System.out.println("car cc is : " +brezza.car_CC);
		System.out.println("showroom location is : " +brezza.showroom_location);
		
		
		
		
	}
}