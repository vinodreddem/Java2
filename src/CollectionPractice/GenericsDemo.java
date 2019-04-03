package CollectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

class Conatiner <T>
{
	T value; //T is any of the type like Integer ,Float ,Student 
	
	public void show()
	{
		System.out.println(value.getClass().getName());
	}
}

//If we need to bound to any one of the data type then we are using container type

class Conatiner1 <T extends Number>
{
	T number;
	public void show()
	{
		System.out.println(number.getClass().getName());
	}
	
	public void Demo (ArrayList<? extends T> obj) //it supports subclasses of Number 
	{
		
	}
	public void Demo1 (ArrayList<? super T> obj) //It supports parent classes of Number but does not support child classes
	{
		
	}
	
	
}
public class GenericsDemo {
	
	public static void main(String [] arg)
	{
		Collection values = new ArrayList();
		values.add(10);
		int a=6;
		values.add(a);
		values.add("Vinod");
		//Herte we can add any type of variable , so we can't achieve type safety here
		//to achieve  type safety , we are coming up with generics in collecion
		
		//int b= Integer.parseInt(((ArrayList) values).get(2).toString());
		//System.out.println(b);//Number Format Exception in Collections
		
		Collection<Integer> numbers = new ArrayList<>();
		//numbers.add("vinod");
		//It will error at compilation time only instead of runtime 
		//if we try to add an integer.
		
		Conatiner <BasicTheory> st = new Conatiner<>()	;	
		Conatiner<Integer>  nu= new Conatiner<>();
		BasicTheory b1 = new BasicTheory();
		st.value =b1;
		st.show();//Result :CollectionPractice.BasicTheory
		
		//With out intializing the object then we will get the Null pointer Exception
		//Exception in thread "main" java.lang.NullPointerException
		
		nu.value =10;
		nu.show();//Result :java.lang.Integer
		
	//	Conatiner1 <BasicTheory> st2 = new Conatiner<>(); //Getting compilation error , since the conatiner is bound to 
		//a class of Number , So it must be Number or their child classes like Integer , Floatg etc..
		
		Conatiner1 <Float> st2 = new Conatiner1<>(); 
		st2.number = 4.4f;
		st2.show();//Result :java.lang.Float
		
		Conatiner1<Number> num = new Conatiner1<>();
		num.Demo(new ArrayList<Integer>()); //Here We can pass integer as well 
		//Here T in Demo Method becomes Number and Number is of any type like Integer
		
		
		//num.Demo1(new ArrayList<Integer>()); //Compilation Error , Since super supports parent class not the child clas
		Set SetValues = new TreeSet();
		
	}

}
