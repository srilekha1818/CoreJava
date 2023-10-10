package CoreJava.FileOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("abc.txt");

		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.write("Hii");
		bw.newLine();
		bw.write("Hello");
		bw.newLine();
		char[] ch={'s','r','i'};
		bw.write(ch);
		bw.newLine();
		bw.write("folks");
		bw.flush();
		bw.close();
	}

}
