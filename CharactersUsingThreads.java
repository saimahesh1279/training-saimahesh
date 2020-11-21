
public class CharactersUsingThreads extends Thread
{
	public void run()
	{
		for(char i='A';i<'F';i++)
		{
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		CharactersUsingThreads ch=new CharactersUsingThreads();
		ch.start();
	}

}