package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Collection has a sort() method to sort the elements based on the whole values
//If we need to sort based on lost index or for a custom type objects based on one attribute then we are using comparator 
//interface in the sort method.

public class ComparatorDemo {

	public static void main(String[] args) {
			
		ArrayList<Integer> values = new ArrayList<>( );
		values.add(502);
		values.add(895);
		values.add(88);
		values.add(99);
		values.add(1543);
		values.add(356);
		
		Collections.sort(values); //This method will sort the values based on the whole values
		//if we need to sort the values based on the last index then we are come up with comparator operator.
		
		for (int a :values)
		{
			System.out.println("vinod the Array elements based on sorting order " +a);
		}
		
		Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
			//	return i1>i2 ? 1 : -1;  this will compare the whole number , if we need to compare based on last digit , we need to use modulos concept 
				//i.e. remainedr calculation
				return i1%10>i2%10 ?1 :-1;
				
				//here 1 means swaping required else no swaping required.
				
				//Similarly we can implement this for custom type as well
				
			}
			
		} ;
		
		Collections.sort(values,com);
		
		for (int a :values)
		{
			System.out.println("vinod the Array elements based on user defined sorting order i.e. last digit" +a);
		}
		

	}

}

