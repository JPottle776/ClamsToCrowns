package ClamsToCrowns;

/*
 * Author: Jamin Pottle and Lucas Eastman
 * Date: October 3rd, 2018
 * 
 * GetInput.java
 */

import java.util.InputMismatchException;
import java.util.Scanner;

//This class is for getting input with a scanner
public class GetInput {

	//Scanner for string
	public static String stringScanner() {
		String userInput = "";
		Scanner input = new Scanner(System.in);
		try {
			userInput = input.nextLine();
		} catch(InputMismatchException e) {
			if(userInput instanceof String) {
				return userInput;
			} else {
				userInput = "401";
				return userInput;
			}
		}
		if(userInput instanceof String) {
			return userInput;
		} else {
			userInput = "401";
			return userInput;
		}
	}
	
	//Scanner for int
	public static int intScanner() {
		int userInput = 0;
		Scanner input = new Scanner(System.in);
		try {//try catch used incase of string input
			userInput = input.nextInt();
		} catch(InputMismatchException e) {
			userInput = 401;
			return userInput;
		}
		return userInput;
	}
	
}
