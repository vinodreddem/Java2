package CollectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import JavaBasics.LinkedListClass;

public class BasicTheory {
	public int a;
	
	public static void main(String [] arg)
	{
		//Creating of All elements 
		Collection values = new ArrayList();//here Collection is interface , we can't create an object to the interface 
		//So we came up with implementation class named ArrayList.
		//Here vales is a type of Object , it accepts any value named int ,String , other Objct etc.
		
		LinkedListClass obj1 = new LinkedListClass();
		values.add(10);
		values.add("Vinod");
		values.add("obj1");
		
		
		//1.Enhanced for Loop
		for(Object i:values)
		{
			System.out.println(i);
		}
		
		//2.Iterator  -used to fetch all the values from the collection
		Iterator r = values.iterator();
		while (r.hasNext())
		{
			System.out.println(r.next());//We need to use next method to get the element
			//other wise it will give stack trace exception.
		}
		
		//3 For Each element
		values.forEach(System.out::println);
		//This is Stream API , Which is used Lambda expression , introduced in java 1.8
		//
	}

}
