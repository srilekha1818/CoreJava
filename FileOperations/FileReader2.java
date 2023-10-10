package CoreJava.FileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("abc.txt");
		FileReader fr=new FileReader(f);
		char ch[]=new char[(int)f.length()];
		//read one character from file store it in array and continue reading
		fr.read(ch);
		for(char data:ch) {
			System.out.print(data);
			
		}
		fr.close();
		
		

	}

}
