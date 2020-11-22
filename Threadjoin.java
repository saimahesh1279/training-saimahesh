import java.util.Scanner;

class AliveEx extends Thread
{
	int x,y;
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x,y values");
		x=sc.nextInt();
	    y=sc.nextInt();
	}
}
public class Threadjoin {

	public static void main(String[] args) throws java.lang.InterruptedException {
		AliveEx al=new AliveEx();
		al.start();
		al.join();
		System.out.println("Sum ="+(al.x+al.y));
		
	}

}