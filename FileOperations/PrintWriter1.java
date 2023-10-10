package CoreJava.FileOperations;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("abc.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.println(100);
		pw.println("whoa");
		pw.println(true);
		pw.println('a');
		char ch[]= {'a','b','c'};
		pw.println(ch);
		
		pw.flush();
		pw.close();
		

	}

}
