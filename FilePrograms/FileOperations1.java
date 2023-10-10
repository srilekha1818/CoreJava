package CoreJava.FilePrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

/*Requirement => file1.txt ,file2.txt copy all the contents to file3.txt*/
public class FileOperations1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("f3.txt");
		BufferedReader br1=new BufferedReader(new FileReader("f1.txt"));
		String line=br1.readLine();
		while(line!=null) {
			pw.println(line);
			line=br1.readLine();
		}
		
		 br1=new BufferedReader(new FileReader("f2.txt"));
		line=br1.readLine();
		while(line!=null) {
			pw.println(line);
			line=br1.readLine();
		}
		pw.flush();
		br1.close();
		pw.close();
		
		

	}

}
