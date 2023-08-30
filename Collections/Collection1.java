package CoreJava.Collections;


import java.util.*;

public class Collection1 {

	public static void main(String[] args) {
		
// Homogeneous data is added
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		System.out.println(al1); //Output: [10, 20, 30]
		System.out.println("---------------");
		
//Heterogeneous data is added
		ArrayList al2=new ArrayList();
		al2.add("Ineuron");
		al2.add(28);
		al2.add('b');
		al2.add(18.5);	
		System.out.println(al2);
		
		System.out.println("----------------");//output: [Ineuron, 28, b, 18.5]
		
		
//we can add entire collection into another collection.
		ArrayList al3=new ArrayList();
		al3.addAll(al2);
		System.out.println(al3);
		
		System.out.println("----------------"); //output: [Ineuron, 28, b, 18.5]
		
// we can replace the element in collection with other element.
		
		ArrayList al4=new ArrayList();
		al4.add(11);
		al4.add(12);
		al4.add(13);
		al4.add(14);
		al4.add(15);
		System.out.println("Existing data"+ al4);//output: Existing data[11, 12, 13, 14, 15]
		
		al4.add(2, 28);
		System.out.println("After replacing data in 2nd index"+al4);// output: After replacing data in 2nd index[11, 12, 28, 13, 14, 15]
		
		al4.add(0, 5);
		System.out.println("After replacing data in front end"+al4);
		
		al4.add(55);
		System.out.println("After replacing data in  rear end"+al4); //output: After replacing data in  rear end[5, 11, 12, 28, 13, 14, 15, 55]
		
         
	}

}
