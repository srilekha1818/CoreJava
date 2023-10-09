package CoreJava.FileOperations;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriter1 {

public static void main(String[] args)throws IOException {
FileWriter fw=new FileWriter("abc.txt");
fw.write(73);
fw.write("neuron\nTechnology\nPrivate\nLimited");
fw.write("\n");
char ch[] ={'a','b','c'};
fw.write(ch);
fw.flush();
fw.close();

}
}
//A new file will be created automatically
//abc.txt