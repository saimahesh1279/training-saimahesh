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

public class Computer
{
	public static void main(String[] args)
	{
		Cpu rog=new Cpu();
		rog.processor_company="AMD";
		rog.processor_model="Ryzen 5 3700GZ";
		rog.motherBoard_company="Gygabyte";
		rog.ram_company="HyperX";
		rog.ram_size=16;
		rog.storage_size=2;		
		rog.graphicCard_company="Gygabyte";	
		rog.smps_company="Corsair";	
		rog.graphicCard_size=6;
		rog.smps_model="650 watts";
		
		
		Display lg=new Display();
		lg.cost=23000;
		lg.display_company="LG";
		lg.display_size=23f;
		lg.display_type="IPS";
		lg.refreshrate=144;
		lg.responce_time=1;
		lg.display_model="D234wde24";
		
		
		
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