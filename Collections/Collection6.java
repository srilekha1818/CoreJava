package CoreJava.Collections;

import java.util.*;

public class Collection6 {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		System.out.println(pq);//output: [25, 50, 125, 100, 75, 150, 175]
//   ->Order insertion is not maintained in Priority Queue
		
//	 ->Duplicates are allowed in priority queue.
		pq.add(25);
		System.out.println(pq);//output: [25, 25, 125, 50, 75, 150, 175, 100]	
	}

}



