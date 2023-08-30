package CoreJava.Collections;

import java.util.*;
public class Collection2 {

	public static void main(String[] args) {
	  LinkedList ll1=new LinkedList();
	  ll1.add(10);
	  ll1.add("ineuron");
	  ll1.add(20);
	  System.out.println(ll1);
	  
//	 Adding data at front
	 ll1.addFirst("Ashish");
	 System.out.println(ll1);
	 
//	 Adding data at middle
	 ll1.add(1, "Hyd");
	 System.out.println(ll1);
	 
//	 Adding data at Last
	 ll1.addLast("infosys");
	 System.out.println(ll1);


	}

}

