import java.util.*;
class Cpu{
	String processor_company;
	String processor_model;
	String motherBoard_company;
	String ram_company;
	int ram_size;
	int storage_size;
	String graphicCard_company;
	int graphicCard_size;
	String smps_company;
	String smps_model;
	

	
	
}
class Display
{
	float display_size;
	int cost;
	String display_type;
	String display_company;
	String display_model;
	int responce_time;
	int refreshrate;
}

public class Scanner_Computer
{
	public static void main(String[] args)
	{
		
		Cpu rog=new Cpu();
		Scanner se=new Scanner(System.in);
		System.out.println("enter the processor company name: ");
		rog.processor_company=se.next();
		System.out.println("enter the processor model: ");
		rog.processor_model=se.next();
		System.out.println("enter the motherboard company name: ");
		rog.motherBoard_company=se.next();
		System.out.println("enter the ram company name: ");
		rog.ram_company=se.next();
		System.out.println("enter the ram size : ");
		rog.ram_size=se.nextInt();
		System.out.println("enter the storage size: ");
		rog.storage_size=se.nextInt();		
		System.out.println("enter the graphic card company name: ");
		rog.graphicCard_company=se.next();	
		System.out.println("enter smps company name: ");
		rog.smps_company=se.next();	
		System.out.println("enter the graphic card size: ");
		rog.graphicCard_size=se.nextInt();
		System.out.println("enter the smps model name: ");
		rog.smps_model=se.next();
		
		
		Display lg=new Display();
		System.out.println("enter the display cost :");
		lg.cost=se.nextInt();
		System.out.println("enter the display company name :");
		lg.display_company=se.next();
		System.out.println("enter the display size :");
		lg.display_size=se.nextFloat();
		System.out.println("enter the display type :");
		lg.display_type=se.next();
		System.out.println("enter the display refresh rate :");
		lg.refreshrate=se.nextInt();
		System.out.println("enter the respoce time :");
		lg.responce_time=se.nextInt();
		System.out.println("enter the display model :");
		lg.display_model=se.next();
		
		
		
		System.out.println("============Cpu details =============");
		
		System.out.println("processor company is : "+rog.processor_company);
		System.out.println("processor model is : "+rog.processor_model);
		System.out.println("motherboard company is : "+rog.motherBoard_company);
		System.out.println("ram company is : "+rog.ram_company);
		System.out.println("ram size is : "+rog.ram_size+"GB");
		System.out.println("storage size is : "+rog.storage_size+"TB");
		System.out.println("graphic card company is : "+rog.graphicCard_company);
		System.out.println("smps company is : "+rog.smps_company);
		System.out.println("graphic card size  is : "+rog.graphicCard_size+"GB");
		System.out.println("smps model  is : "+rog.smps_model);
		

		System.out.println("============Display details=============");
		
		System.out.println("display company is : "+lg.display_company);
		System.out.println("display cost is : "+lg.cost);
		System.out.println("display size is : "+lg.display_size+"inches");
		System.out.println("display type is : "+lg.display_type+"pannel");
		System.out.println("display refreshrate  is : "+lg.refreshrate+"hz");
		System.out.println("display responcetime is : "+lg.responce_time+"Ms");		
		System.out.println("display model is : "+lg.display_model);
	}
}