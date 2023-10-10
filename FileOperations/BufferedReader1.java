package CoreJava.FileOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("abc.txt");
      BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null) {
		System.out.println(line);
		line=br.readLine();
		}
	br.close();
	}
	

}
