package JavaBasics;

import java.util.ArrayList;

public class ArrayListClass {
//Added the commi
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st method
		ArrayList<Integer> integer = new ArrayList<Integer>(5);
		integer.add(11);
		integer.add(1);
		integer.add(11);
		integer.add(33);
		integer.add(11);
		integer.add(25);
		integer.add(11);
		
		
		for (Integer  i :integer )
		{
			System.out.print(i);
		}
		
		//size of an element 
		
		System.out.println("The Size of the ArrayList "+integer.size()); //it will returns the number of 
		//elements contain by array not the intialiazd six=ze
		//Even if we are mentioning size , we are able toadd after size also to the array list 
		//but  is is not possible in array
		
		//Remove an element
		integer.remove(3);
		System.out.println("The Size of the ArrayList after remove "+integer.size()); 
		
		//Change of the value for corresponding index
		integer.set(1, 5656);
		System.out.println("The Size of the ArrayList after change "+integer.get(1)); 
		
		//Clear all the numbers 
		integer.clear();
		System.out.println("The Size of the ArrayList after clear "+integer.size()); 
		
		int intArray[] = new int[6]; //1 st method we can add data upto 6 variable
		//No Add functions in array , so we need to add by indices in array 
		intArray[0] =10;
		intArray[1] =10;//should not use open brackeets while assign a value
		intArray[5]=50;//if we do not define then consider default value i.e. 0 intArray[2] =0
		for (int i :intArray )
		{
			System.out.print(i);
		}
		
		int[] intArray2 = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; //2nd method
	}

}
