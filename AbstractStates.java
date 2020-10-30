abstract class India1 {
	public abstract void cm();
	public abstract void hc();

	public void pm()
	{
		System.out.println("pm of india is modi");
	}
	public void president()
	{
		System.out.println("president of india is kovind");
	}
	public void capital()
	{
		System.out.println("capital of india delhi`");
	}
	public void SC()
	{
		System.out.println(" location of SC is in  delhi");
	}
	public void lang()
	{
		System.out.println("lang is Hindhi");
	}
}
class AP1 extends India1{
	public void cm()
	{
		System.out.println("cm of AP id jagan");
		
	}
	public void capital()
	{
		System.out.println("capital of AP isAmaravati");
		
	}
	public void hc()
	{
		System.out.println("hc is in amaravathi");
		
	}
	public void lang()
	{
		System.out.println("lang is telugu");
	}
}

class TN1 extends India1{
	
	public void cm()
	{
		System.out.println("cm of TN is K. Palaniswami");
		
	}
	public void capital()
	{
		System.out.println("capital of TN is chennai");
		
	}
	public void hc()
	{
		System.out.println("hc is in chennai");
		
	}
	public void lang()
	{
		System.out.println("lang is tamil");

}
}
class TS1 extends India1{

	public void capital()
	{
		System.out.println("capital of TS is hyd");
		
	}
	public void hc()
	{
		System.out.println("hc is in hyd");
		
	}
	public void lang()
	{
		System.out.println("lang is Hindhi,telugu");
	}
	@Override
	public void cm() {
		System.out.println("cm is KCR");
		
	}

}
public class AbstractStates {
public static void main(String[] args) {
	TS1 t=new TS1();
	
	
	t.capital();
	t.cm();
	t.hc();
	t.president();
	t.SC();
	t.lang();
	System.out.println("==========================================");
	AP1 a=new AP1();
	a.capital();
	a.cm();
	a.hc();
	a.president();
	a.SC();
	a.lang();
	System.out.println("==========================================");
	TN1 tn=new TN1();
	tn.capital();
	tn.cm();
	tn.hc();
	tn.president();
	tn.SC();
	tn.lang();
}
}