import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWR {
public static void main(String[] args) throws IOException {
	CharArrayWriter cw=new CharArrayWriter();
	String s="This a new world";
	cw.write(s);
	cw.append("but sill fails");
	cw.close();
	CharArrayReader cr= new CharArrayReader(cw.toCharArray());
	int i=cr.read();
	while(i!=-1)
	{
		System.out.print((char)i);
		i=cr.read();
	}
	cr.close();
}
}
//The CharArrayWriter class can be used to write common data to multiple files. This class inherits Writer class. Its buffer automatically grows when data is written in this stream.
//The CharArrayReader is composed of two words: CharArray and Reader. The CharArrayReader class is used to read character array as a reader (stream). It inherits Reader class.