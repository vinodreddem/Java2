//
//
//
package JavaBasics;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare a linked list
		LinkedList<String> nameArray = new LinkedList<String> ();
		nameArray.add("vinod");
		nameArray.add("vijay");
		nameArray.add("Vishnu");
		nameArray.add("Ajay");
		nameArray.add("Ajith");
		
		for (String  x :nameArray)
			System.out.println(x);
		System.out.println("The Size of the list " + nameArray.size());
		nameArray.addFirst("RVINDa");
		nameArray.addLast("arjn");
		
		System.out.println("The Size of the list after Add" + nameArray.size());
		
		for (String  x :nameArray)
			System.out.println("After Adding " +x);
		nameArray.removeLast();
		System.out.println("The Size of the list after remove " + nameArray.size());
		//Clear alll data
		nameArray.clear();
		System.out.println("The Size of the list after clear" + nameArray.size());
	}

}
