import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
 {
	 int Id;
	 String name;
	 double marks;

public Student(int id, String name, double marks) {
		super();
		Id = id;
		this.name = name;
		this.marks = marks;
	}
    public void Display()
    {
    	System.out.println("Id is :"+ this.Id);
    	System.out.println(("Name is :"+this.name));
    	System.out.println("Marks are :"+this.marks);
    }
	public void writeObject(Student mahesh) {
		// TODO Auto-generated method stub
		
	}}
public class SerializableDeserializable1 {

	public static void main(String[] args) throws IOException {
		System.out.println("===========Student Details===========");
		Student mahesh=new Student(1,"sai mahesh",756);
		File f1=new File("D://student.txt");
		f1.createNewFile();
		mahesh.writeObject(mahesh);
		//decerialization
		FileOutputStream fos=new FileOutputStream(f1);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		mahesh.Display();
		
		oos.flush();
		oos.close();
		fos.close();
		
		
		

	}

}