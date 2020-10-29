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
	public Cpu(String processor_company, String processor_model, String motherBoard_company, String ram_company,
			int ram_size, int storage_size, String graphicCard_company, int graphicCard_size, String smps_company,
			String smps_model) {
		
		this.processor_company = processor_company;
		this.processor_model = processor_model;
		this.motherBoard_company = motherBoard_company;
		this.ram_company = ram_company;
		this.ram_size = ram_size;
		this.storage_size = storage_size;
		this.graphicCard_company = graphicCard_company;
		this.graphicCard_size = graphicCard_size;
		this.smps_company = smps_company;
		this.smps_model = smps_model;
	}
	

	
	
}
class Display
{
	
	public Display(float display_size, int cost, String display_type, String display_company, String display_model,
			int responce_time, int refreshrate) {
		
		this.display_size = display_size;
		this.cost = cost;
		this.display_type = display_type;
		this.display_company = display_company;
		this.display_model = display_model;
		this.responce_time = responce_time;
		this.refreshrate = refreshrate;
	}
	float display_size;
	int cost;
	String display_type;
	String display_company;
	String display_model;
	int responce_time;
	int refreshrate;
}

public class ConstructorComputer
{
	public static void main(String[] args)
	{
		
		Cpu rog=new Cpu("amd","ryzen5", "Gygabyte","Hyperx",16,2,"zotac gtx 1660",8,"corsair","650watts");
		
		
		
		
		Display lg=new Display(27f,23000,"ips","LG","hefb",1,144);
		
		
		
		
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