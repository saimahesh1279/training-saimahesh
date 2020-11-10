import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringWR {
public static void main(String[] args) throws IOException {
	StringWriter sw= new StringWriter();
	String s="this is my personal computer";
	sw.write(s);
	sw.append("Dont touch it");
	StringReader sr=new StringReader(sw.toString());
	int i=sr.read();
	while(i!=-1)
	{
		System.out.print((char)i);
		i=sr.read();
	}
	sr.close();
}
}
