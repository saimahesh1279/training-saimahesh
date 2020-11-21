

class MyAccount
{
	int balance=25000;
	public synchronized void cash(int balance)
	{
		System.out.println("Cash is withdrawn succesfully");
		if(this.balance<balance)
		{
			System.out.println("Add some money");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.balance=this.balance-balance;
		System.out.println("Withdrawn completed");
	}
	public synchronized void deposit(int balance)
	{
		System.out.println("Depsoting the money");
		this.balance+=balance;
		System.out.println("Successfully deposited");
		notify();
	}
}
public class Withdraw {

	public static void main(String[] args) {
		MyAccount mahesh=new MyAccount();
		new Thread() {
			public void run()
			{
				mahesh.cash(200000);
			}
			
		}.start();
		new Thread() {
			public void run()
			{
				mahesh.deposit(200000);
			}
			
		}.start();
	}

}