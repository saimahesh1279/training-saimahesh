
class Conversion
{
	String name;
	public Conversion(String name)
	{
		this.name=name;
	}
	public synchronized void show(String name)
	{
		System.out.println(name );
		if(this.name.charAt(0)!='A')
		{
			System.out.println("YOur name "+ this.name);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void duplicate(String name)
	{
		System.out.println("After entering");
		notify();
		this.name='a'+name;
		System.out.println(this.name);
	}
	
}
public class Tables extends Thread{

	public static void main(String[] args) {
		Conversion con=new Conversion("mahesh");
		new Thread() {
			public void run()
			{
				con.show("mahesh");
			}
		}.start();
		new Thread() {
			public void run()
			{
				con.duplicate("mahesh");
			}
			
		}.start();

	}

}
