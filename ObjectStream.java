import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {
public static void main(String[] args) throws IOException {
	FileOutputStream fo=new FileOutputStream("G:\\office work\\files\\a.txt");
	ObjectOutputStream ob=new ObjectOutputStream(fo);
	String s="this is mahesh";
	ob.writeChars(s);
	ob.close();
	//The Java.io.ObjectOutputStream class writes primitive data types and graphs of Java objects to an OutputStream.The objects can be read (reconstituted) using an ObjectInputStream.

	FileInputStream fi=new FileInputStream("G:\\office work\\files\\a.txt");
	ObjectInputStream oi=new ObjectInputStream(fi);
	int i=oi.read();
	while(i!=-1)
	{
		System.out.print((char)i);
		i=oi.read();
		
	}
	
	oi.close();
}
}
//Java ObjectInputStream class. The objectinputstream class is mainly used to deserialize the primitive data and objects which are written by using ObjectOutputStream. 
//ObjectInputStream can also be used to pass the objects between hosts by using a SocketStream.
