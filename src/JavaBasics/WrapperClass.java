
//***********************************************************************
//Wrapper class concept :
//Converting of the primitive data  into an object and vice versa is called 
// Wrapper class concept.
//primitive to object ------Auto Boxing
//ClonableExample.Object to Primitiv ---Unboxing

//Primitive Type		Wrapper class
//--------------		-------------
//boolean				Boolean
//char					Character
//byte					Byte
//short					Short
//int					Integer
//long					Long
//float					Float
//double				Double
//***********************************************************************
package JavaBasics;
public class WrapperClass {
	public static void main (String ...strings) 
	{
		char r  = 'R' ;
		 Character r1 = Character.valueOf(r);
		 
		 System.out.println(" The Character value is " +r1);
		 Integer integer1 = new Integer (10);
		 int  i = integer1.intValue();
		 System.out.println(" The int value is " +i);
		 
		 //*****************************************************
		 //Strictfp -KeyWord -Strictly floating point
		 //This will ensure that we will get the same results on every platform 
		 //if you perform operations on the floating point.
		 // Note :
		 //The strictfp keyword cannot be applied on abstract methods, variables or constructors.
		 //he strictfp keyword can be applied on methods, classes and interfaces.
		 //*********************************************************************
		 
	} 
}
