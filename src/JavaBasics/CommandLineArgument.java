/***************************************************************************
 * The java command-line argument is an argument i.e. passed at the time of running the java program.
 *The arguments passed from the console can be received in the java program and it can be used as an input.
 * 
 ************************************************************************************/
package JavaBasics;

public class CommandLineArgument {
	public static void main(String args[]){  
		System.out.println("Your first argument is: "+args[0]);  
		}  
	//We can't run this here we need to run from command line
	//here we will get the Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	//in console as well we will get same error ,if we didn't given any input
	
	//How to Run :
	//Commands :
	//compile by > javac CommandLineExample.java  
	//run by > java CommandLineExample sonoo  
	
	//Output: Your first argument is: sonoo

}
