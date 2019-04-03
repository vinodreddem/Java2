package JavaBasics;

interface A {
	void Show(); //Don't have body in interface methods { ....body....}
}

interface B {
	
}
public class LamdaDemo {

	public static void main(String[] args) {
		
		//Now how can we create a an object with reference variable of the A 
		//Before Java 8 ----We are using the anonymous inner class
		//Annonymous Inner Class ----A class which does not have an object
		
		//A obj = new A () ; --------This is not possible because we can not create an object of the interface 
		//So use the anonymous class
		
		
		//Here overall how many classes created? 
		//1 or 2 or 3
		//Answer is --3 
		//1. Class A
		//2  LamdaDemo class
		//3 LamdaDemo$1 ----for anonymous class 
		
		A obj =new A () 
				{
					public void Show() {
							System.out.println(" vinod inside the anonymous class ");
					}
			
				} ;
				obj.Show();
				
		/*		new A () 
				{
					public void Show()  */
				
				//The bove part is called boiler code 
				//We don't require that part while writing lambd expressions
				
				A obj2 = () -> {
					System.out.println(" vinod inside the lamda expression class ");
					
				} ;

				A obj3 = () -> System.out.println(" vinod inside the lamda expression class ");//single line
				
				A obj4 = ()->{};
//				A obj5 =() -> {return "Mario" ;};
//				A obj6 - ()-> "vino";
					
				}
				
				

	}


