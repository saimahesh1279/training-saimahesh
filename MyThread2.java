
public class MyThread2 extends Thread {
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		MyThread2 thread=new MyThread2();
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.setName("sparrow");
		MyThread2 thread2=new MyThread2();
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.setName("draago");
		thread.start();
		thread2.start();
		}

}
