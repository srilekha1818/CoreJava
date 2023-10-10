package CoreJava.serializability;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Dog implements Serializable
{
static{
System.out.println("static block gets executed...");
}
Dog(){
System.out.println("Object is created...");
}
int i = 10;
int j = 20;
}

class Cat implements Serializable{
	static {
		System.out.println("static block executed");
	}
	Cat(){
		System.out.println("cat object created");
	}
	int i=100;
	int j=200;
}
public class DogCat {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Cat c=new Cat();
		System.out.println("Serialization started.....");
		String fileName = "abc.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(c);
		System.out.println("Serialized Object refernce is ::"+d);
		System.out.println("Serialized Object refernce is ::"+c);
		System.out.println("Serialization ended.....");
		System.out.println("Serialization ended");
		System.out.println("Deserialization started");
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog) ois.readObject();
		Cat c2=(Cat) ois.readObject();
		System.out.println("Deserialization ended");
		System.out.println("Dog object data");
		System.out.println(d2.i+"\t" +d2.j);
		System.out.println("Cat object data");
		System.out.println(c2.i+"\t" +c2.j);
	}

}
