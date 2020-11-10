import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilewritterANDReader {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("G:\\office work\\files\\a.txt");
	fw.write("finally completed");
	fw.close();
	//The class is used for writing streams of characters. This class has several constructors to create required objects. Following is a list. This constructor creates a FileWriter object given a File object. This constructor creates a FileWriter object given a File object with a boolean indicating whether or not to append the data written.
	FileReader fr=new FileReader("G:\\office work\\files\\a.txt");
	int i=fr.read();
	while(i!=-1)
	{
		System.out.print((char)i);
		i=fr.read();
	}
	fr.close();
}
}
//ava FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class. It is character-oriented class which is used for file handling in java. 