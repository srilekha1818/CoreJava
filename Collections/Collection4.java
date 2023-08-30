package CoreJava.Collections;
import java.util.LinkedList;

public class Collection4 {

	public static void main(String[] args) {
	
		LinkedList ll1=new LinkedList();
		
		ll1.add(10);
		ll1.add(20);
		ll1.add(40);
		ll1.add(30);
		ll1.add(40);
		System.out.println(ll1); //output: [10, 20, 40, 30, 40]
		
//	->getFirst - Accessing the first object in collection 
		System.out.println(ll1.getFirst()); //output: 10
		
//  ->getFirst - Accessing the first object in collection 
		System.out.println(ll1.getLast()); //output: 40
//	->if you have duplicates in collection when we access the object
//	   by default it gives first index 
		System.out.println(ll1.indexOf(40)); //output: 2 
//	Get index of last element
		System.out.println(ll1.lastIndexOf(40)); //output:4
		
//   ->Adding data at first and last by using offerFist() and 
//		offerLast() method
		
//		ll1.offerFirst(5);
//		ll1.offerLast(6);
//		System.out.println(ll1); //output: [5, 10, 20, 40, 30, 40, 6]
		
//	 ->Adding data at first and last by using addFirst() and 
//	   addLast() methods
		
		ll1.addFirst(5);
		ll1.addLast(6);
		System.out.println(ll1); //output: [5, 10, 20, 40, 30, 40, 6]
		

//	->fetching first data of the collection by using peekFirst()
//	->by using peekFirst() method object will copied from
//	  collection. Collection will not get affected.
	   System.out.println(ll1.peekFirst()); //output: 5
	   System.out.println(ll1); //output: [5, 10, 20, 40, 30, 40, 6]
	   
	   
//	->fetching first index data by pollFirst() method
//	->by using pollFirst() method object will be permanantly 
//	  fetched from collection.  Collection get affected.
	    System.out.println(ll1.pollFirst());//output: 5
	    System.out.println(ll1); //output:[10, 20, 40, 30, 40, 6]
//	->5 is removed from collection.
	    
//	->getting Last data of the collection
	  System.out.println(ll1.peekLast()); // output: 6
	}

}
