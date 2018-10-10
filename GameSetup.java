package ClamsToCrowns;
//import com.oracle.jrockit.jfr.DataType;

/*
 * Author: Jamin Pottle and Lucas Eastman
 * Date: October 3rd, 2018
 * 
 * GameSetup.java
 */

//Sets up the game
public class GameSetup {
	public static void main(String [] args) {
		//Global Variables
		
//		Lucas
//		Integer play = 10;
		int play = 10;
		
		System.out.println("Welcome to Clams to Crown!");
		do {//loops through till player enters correct input
			System.out.println(" Enter - 1\n Exit - 2");
			//checks if player enter or exit
			
//				Lucas
//				play = GetInput.intScanner();
				play = GetInput.intScanner();
				if(play == 1) {
					break;
				} else if(play == 2) {
					System.out.println("You have exited Clams to Crowns");
					System.exit(0);
				} else {
					System.out.println("Please enter correct input.");
				}
		} while(play != 1 || play != 2);
		GamePlay.play();//calls main GamePlay'
	}
}
