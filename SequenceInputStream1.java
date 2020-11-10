
import java.io.*;

public class SequenceInputStream1 {
	public static void main(String args[]) throws Exception {
		FileInputStream fin1 = new FileInputStream("G:\\office work\\files\\file1.txt");
		FileInputStream fin2 = new FileInputStream("G:\\office work\\files\\file2.txt");
		FileOutputStream fout = new FileOutputStream("G:\\office work\\files\\file3.txt");
		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
		int i;
		while ((i = sis.read()) != -1) {
			fout.write(i);
		}
		sis.close();
		fout.close();
		fin1.close();
		fin2.close();
		System.out.println("Success..");
	}
}


 //SequenceInputStream is use to read and write multiple files at same time in a give order.
 // Java SequenceInputStream class is used to read data from multiple streams. It reads data sequentially (one by one).


