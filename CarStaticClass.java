class Car{
	static class NissanSunny{
		void cost() {
			System.out.println("cost is 50lakhs");
		}
		static void milage() {
			System.out.println("milage is 12kmpl");
		}
	}
	
}
public class CarStaticClassDemo {

	public static void main(String[] args) {
		Car.NissanSunny c=new Car.NissanSunny ();
		c.announcement();
		Car.NissanSunny.result();

	}

}
