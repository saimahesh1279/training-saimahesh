
public class Priority extends Thread 
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Priority prior=new Priority();
		prior.setName("sparrow");
		prior.setPriority(1);
		Priority xyz=new Priority();
		xyz.setName("draago");
		xyz.setPriority(10);
		prior.start();
		xyz.start();
		Priority abc=new Priority();
		abc.start();
		
	}

}