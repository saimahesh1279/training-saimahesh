abstract class Car{
	abstract void cost();
	abstract void milage();
}
class anonimousClass2
{
	public static void main(String[] args) {
		Car c=new Car() {
			
			
			void milage() {
				System.out.println("cost of the car is 45lakhs");
				
			}
			
			
			void cost() {
				System.out.println("milage of car is 12kmpl");
				
			}
		};
		c.cost();
		c.milage();
	}
}