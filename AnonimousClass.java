abstract class Person{
	abstract void eat();
	
}
class AnonimousClass
{
	public static void main(String[] args) {
		Person mahesh=new Person( ) {
			
			void eat() {
				System.out.println("eating favorite food");
				
			}
		};
		mahesh.eat();
	}
}