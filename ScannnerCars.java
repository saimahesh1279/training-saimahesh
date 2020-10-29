import java.util.*;
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

public class ScannnerCars
{
	public static void main(String[] args)
	{
		Car verna=new Car();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter model name : ");
		verna. model_name=sc.next();
		System.out.println("enter car width : ");
		verna.car_width=sc.nextInt();
		System.out.println("enter car height : ");
		verna.car_height=sc.next();
		System.out.println("enter car weight : ");
		verna.car_weight=sc.nextInt();
		System.out.println("enter  car topspeed : ");
		verna.car_topSpeed=sc.nextInt();
		System.out.println("enter company name : ");
		verna.company_name=sc.next();
		System.out.println("enter showroom location : ");
		verna.showroom_location=sc.next();		
		System.out.println("============car details =============");
		System.out.println("model name is : " +verna. model_name);
		System.out.println("car width  is : " +verna.car_width);
		System.out.println("car height id is : " +verna.car_height);
		System.out.println("car weight is : " +verna.car_weight);
		System.out.println("car company name is : " +verna.company_name);
		System.out.println("car topspeed is : " +verna.car_topSpeed);
		System.out.println("showroom location is : " +verna.showroom_location);




		Car brezza=new Car();
		System.out.println("enter model name : ");
		verna. model_name=sc.next();
		System.out.println("enter car width : ");
		verna.car_width=sc.nextInt();
		System.out.println("enter car height : ");
		verna.car_height=sc.next();
		System.out.println("enter car weight : ");
		verna.car_weight=sc.nextInt();
		System.out.println("enter  car topspeed : ");
		verna.car_topSpeed=sc.nextInt();
		System.out.println("enter company name : ");
		verna.company_name=sc.next();
		System.out.println("enter showroom location : ");
		verna.showroom_location=sc.next();
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