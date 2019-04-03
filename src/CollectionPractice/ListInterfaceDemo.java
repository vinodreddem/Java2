package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//*******************************************************************************************
//List interface is extends the collection interface which has extra feature named
// index based behaviour , So that we can add or Remove elements between two elements.
//
//List is an interface which we can not instantiated (can not create an object
//So we need to create reference variable of the List with Arraylist.
//i.e. List is implemented by Arraylist and extends Collection interface
//********************************************************************************************

public class ListInterfaceDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(29);
		numbers.add(67);
		numbers.add(88);
		numbers.add(1,45); //Added element at index 1
		numbers.add(3,8);
		numbers.forEach(System.out::println);//Iterable interface implemented forEach default method i java 8.
		System.out.println("Vinod Thirsd element is "+numbers.get(3));
		Collections.sort(numbers); //After sorting the indext order for the numbers will change
		numbers.forEach(System.out::println);
		System.out.println("Vinod Thirsd element is "+numbers.get(3));
	}

}
