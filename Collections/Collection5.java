package CoreJava.Collections;
import java.util.ArrayDeque;
public class Collection5 {

	public static void main(String[] args) {
		ArrayDeque ad= new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(30);
		System.out.println(ad);  //output: [10, 20, 30, 30]
		
		ad.addFirst(6);
		ad.addLast(4);
		System.out.println(ad); //output: [6, 10, 20, 30, 30, 4]
		
		ArrayDeque ad1=new ArrayDeque();
		ad1.add(80);
		ad1.addAll(ad);
		System.out.println(ad1); //output: [80, 6, 10, 20, 30, 30, 4]
	}

}

