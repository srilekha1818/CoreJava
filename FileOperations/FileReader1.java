package CoreJava.FileOperations;

import java.io.FileReader;
import java.io.IOException;
public class FileReader1 {
public static void main(String[] args)throws IOException {
FileReader fr=new FileReader("C:\\Users\\lenovo\\Desktop\\CoreJava\\src\\CoreJava\\FileOperations\\fileoperations.txt");
int i=fr.read();
while(i!=-1){
System.out.println((char)i);
i=fr.read();
}

}
}