


class Alive extends Thread
{
	public void run()
	{
		System.out.println("Running.........."+Thread.currentThread().getName());
	}
}
public class ThreadgetName {

	public static void main(String[] args) {
		System.out.println("Running.........."+Thread.currentThread().getName());
		Alive a=new Alive();
		Alive al=new Alive();
		System.out.println(a.getName());
		System.out.println(al.getName());
		a.setName("sai");
		al.setName("mahesh");
		a.start();
		al.start();
		
		
		
	}

}