package CoreJava.serializability;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animals implements Serializable{
int i=10;
}
class Dogs extends Animals{
int j=20;
}

public class SerialInherit {
public static void main(String[] args)throws IOException,ClassNotFoundException{
Dogs d=new Dogs();
System.out.println("Serialization started");
FileOutputStream fos=new FileOutputStream("abc.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(d);
System.out.println("Serialization ended");
System.out.println("******************************");
System.out.println("DeSerialization started");
FileInputStream fis=new FileInputStream("abc.ser");
ObjectInputStream ois=new ObjectInputStream(fis);
Dogs d1=(Dogs)ois.readObject();
System.out.println(d1.i+"====> "+d1.j);
System.out.println("DeSerialization ended");
}
}