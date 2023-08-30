package CoreJava.Collections;

import java.util.*;

public class Collection7 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);// output: [25, 50, 75, 100, 125, 150, 175]

		
		System.out.println(ts.ceiling(50)); //output:50
		System.out.println(ts.higher(50));  //output:75
		System.out.println(ts.floor(50));   //output:50
		System.out.println(ts.lower(50));   //output:25
		System.out.println("-------------------");
		
		System.out.println(ts.ceiling(40));  //output:50
		System.out.println(ts.higher(40));   //output:50
		System.out.println(ts.floor(40));    //output:25
		System.out.println(ts.lower(40));    //output:25
		
		
	}

}
