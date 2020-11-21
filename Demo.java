
public class Demo extends Thread{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.start();
	}
}