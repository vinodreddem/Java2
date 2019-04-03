/**
 * 
 */
package JavaBasics;

import java.util.Scanner;

/**
 * @author Sanvi
 *
 */
public class userInput {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("please enter the number ");
		int user_input = (int) scan.nextDouble();
		System.out.println("the entered value " +user_input);
		
		//Character
		Scanner scan_char =new Scanner(System.in);
		System.out.println("please enter the number ");
		char user_input_char = scan_char.next().charAt(0);
		System.out.println("please enter the number "+user_input_char);
	}

}
