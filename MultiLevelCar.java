class Car{
   public Car()
   {
	System.out.println("Class Car");
   }
   public void vehicleType()
   {
	System.out.println("Vehicle Type: Car");
   }
}
class Maruti extends Car{
   public Maruti()
   {
	System.out.println("Class Maruti");
   }
   public void brand()
   {
	System.out.println("Brand: Maruti");
   }
   public void speed()
   {
	System.out.println("Max: 90Kmph");
   }
}
class MarutiBrezza extends Maruti{

   public void model()
   {
	System.out.println("Maruti Model: Brezza");
   }
   public void speed()
   {
	System.out.println("Max: 80Kmph");
   }
}
public class MultiLevelCar
{
   public static void main(String args[])
   {
	 MarutiBrezza obj=new MarutiBrezza();
	 obj.vehicleType();
	 obj.brand();
	 obj.speed();
	obj.model();
   }
}