interface Vehicle{
 void cost();
 void milage();
 void capacity();
 void fuel();
}
abstract class Car {
 void viper(){
  System.out.println("Car has two vipers");
 }
 void doors(){
  System.out.println("Car has 4 doors");
 }
 Car(){
  System.out.println("In car constructor");
 }
 Car(String name){
  System.out.println("In car paramterized constructor");
  System.out.println("Car name is "+name);
 }
}
abstract class Bike{
 void stand(){
  System.out.println("Car has two stands");
 }
 Bike(){
  System.out.println("In Bike constructor");
 }
 Bike(String name){
  System.out.println("In Bike paramterized constructor");
  System.out.println("Bike name is "+name);
 }
}
class Benz extends Car implements Vehicle{
     Benz(){
        super("BENZ");
    }
    public void cost(){
        System.out.println("BENZ cost is: 80lakhs");
    }
    public void milage(){
        System.out.println("BENZ milage is: 12km");
    }
    public void capacity(){
        System.out.println("BENZ capacity is: 7");
    }
    public void fuel(){
        System.out.println("BENZ fuel is: diesel");
    }
}
class Audi extends Car implements Vehicle{
 public void cost(){
  System.out.println("Audi cost is: 60lakhs");
 }
 public void milage(){
  System.out.println("Audi milage is: 10km");
 }
 public void capacity(){
  System.out.println("Audi capacity is: 2");
 }
 public void fuel(){
  System.out.println("Audi fuel is: diesel");
 }
}

class Mt15 extends Bike implements Vehicle{
 public void cost(){
  System.out.println("Mt15 cost is: 1lakhs");
 }
 public void milage(){
  System.out.println("Mt15 milage is: 60km");
 }
 public void capacity(){
  System.out.println("Mt15 capacity is: 2");
 }
 public void fuel(){
  System.out.println("Mt15 fuel is: petrol");
 }
}
class Activa extends Bike implements Vehicle{
 Activa(){
  super("Activa");
 }
 public void cost(){
  System.out.println("Activa cost is: 82500");
 }
 public void milage(){
  System.out.println("Activa milage is: 65km");
 }
 public void capacity(){
  System.out.println("Activa capacity is: 2");
 }
 public void fuel(){
  System.out.println("Activa fuel is: petrol");
 }
}
class VehicleInterface {
  public static void main(String[] args) {
    Audi item = new Audi();
    item.cost();
    item.milage();
    item.capacity();
    item.fuel();
    item.viper();
    item.doors();
    Benz item1 = new Benz();
    item1.cost();
    item1.milage();
    item1.capacity();
    item1.fuel();
    item1.viper();
    item1.doors();
      Mt15 ride= new Mt15();
    ride.cost();
    ride.milage();
    ride.capacity();
    ride.fuel();
    ride.stand();
    Activa ride1= new Activa();
    ride1.cost();
    ride1.milage();
    ride1.capacity();
    ride1.fuel();
    ride1.stand();
  }
}