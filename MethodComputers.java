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
	
void display()
{
System.out.println("============Cpu details =============");
		
		System.out.println("processor company is : "+processor_company);
		System.out.println("processor model is : "+processor_model);
		System.out.println("motherboard company is : "+motherBoard_company);
		System.out.println("ram company is : "+ram_company);
		System.out.println("ram size is : "+ram_size+"GB");
		System.out.println("storage size is : "+storage_size+"TB");
		System.out.println("graphic card company is : "+graphicCard_company);
		System.out.println("smps company is : "+smps_company);
		System.out.println("graphic card size  is : "+graphicCard_size+"GB");
		System.out.println("smps model  is : "+smps_model);
}
	
	
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


void display()
{

		System.out.println("============Display details=============");
		
		System.out.println("display company is : "+display_company);
		System.out.println("display cost is : "+cost);
		System.out.println("display size is : "+display_size+"inches");
		System.out.println("display type is : "+display_type+"pannel");
		System.out.println("display refreshrate  is : "+refreshrate+"hz");
		System.out.println("display responcetime is : "+responce_time+"Ms");		
		System.out.println("display model is : "+display_model);

}
}





public class MethodComputers
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
		
		rog.display();

		
		Display lg=new Display();
		lg.cost=23000;
		lg.display_company="LG";
		lg.display_size=23f;
		lg.display_type="IPS";
		lg.refreshrate=144;
		lg.responce_time=1;
		lg.display_model="D234wde24";
		
		lg.display();		
		
		
		

	}
}