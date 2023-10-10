package CoreJava.FilePrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

/*Requirement => file1.txt file2.txt copy one line from file1.txt and from file2.txt
to file3.txt.*/
public class FileOperations2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("f3.txt");
		BufferedReader br=new BufferedReader(new FileReader("f1.txt"));
		String line=br.readLine();
		BufferedReader br1=new BufferedReader(new FileReader("f2.txt"));
		String line1=br1.readLine();
		while(line!=null ||line1!=null) {
			if(line!=null) {
			pw.println(line);
			line=br.readLine();
			}
			if(line1!=null) {
				pw.println(line1);
			line1=br1.readLine();
			}
			
			
			
		}
		pw.flush();
		br.close();
		br1.close();
		pw.close();
		

	}

}
