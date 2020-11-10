import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWritter1 {
public static void main(String[] args) throws FileNotFoundException {
	PrintWriter pw= new PrintWriter("G:\\office work\\files\\testout.txt");
	String s="my name is mahesh";
	pw.write(s);
	pw.print(s);
	pw.close();
}
}
