class India {
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
class AP extends India{
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
class TN extends India{
	
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
class TS extends India{

	public void cm()
	{
		System.out.println("cm of int ts is KCR");
		
	}
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

}
public class InheritanceStates {
public static void main(String[] args) {
	TS t=new TS();
	AP a=new AP();
	TN tn=new TN();
	t.capital();
	t.cm();
	t.hc();
	t.president();
	t.SC();
	t.lang();
	
	System.out.println("==========================================");
	a.capital();
	a.cm();
	a.hc();
	a.president();
	a.SC();
	a.lang();
	System.out.println("==========================================");
	tn.capital();
	tn.cm();
	tn.hc();
	tn.president();
	tn.SC();
	tn.lang();
}
}
