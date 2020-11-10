import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedWritterAndReader {

	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("G:\\office work\\files\\testout.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("Welcome to Hyderabad.");
		buffer.close();
		System.out.println("Success");
		//The BufferedWriter class of the java.io package can be used with other writers to write data (in characters) more efficiently.
		FileReader fr= new FileReader("G:\\office work\\files\\testout.txt");
		BufferedReader br= new BufferedReader(fr);
		int i=br.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=br.read();
		}
		br.close();
	}

}
//BufferedReader is a Java class to reads the text from an Input stream (like a file) by buffering characters that seamlessly reads characters, arrays or lines.
