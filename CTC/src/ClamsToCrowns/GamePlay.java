package ClamsToCrowns;
import java.util.ArrayList;
import java.util.List;

/*
 * Author: Jamin Pottle and Lucas Eastman
 * Date: October 3rd, 2018
 * 
 * GamePlay.java
 */

public class GamePlay {
	
	//main vars for gameplay
	static String playerTitle[] = new String[] {"Slave", "Peasant", "Knight", "Royal Knight", "Lord", "Prince", "King", "The Dark One"};
	static int titleNum = 0;//used for geting playerTitle
	static String playerName = "";
	static int level = 0;
	static int xp = 0;
	static int coins = 1;
	
	//function for man game play
	public static void play() {
		System.out.println("Do you have an existing account?\n 1 - Yes\n 2 - No");
		int input = 0;
		do {
			input = GetInput.intScanner();
			if(input == 1) {//yes they have account
				//call class that references database
				break;
			} else if(input == 2) {//no they do not have account
				//call class that references function to create account
				break;
			} else {
				System.out.println("Please enter correct input.");
			}
		}while(input != 1 || input != 2);
		
		if(input == 1) {//yes they have account
			//call class that references database
		} else if(input == 2) {//no they do not have account
			//call class that references function to create account
//			accountInfo = CreateAccount.createAccount();
			System.out.println("Enter the name you want to be known by.");
			System.out.print("Player Name: ");
			playerName = GetInput.stringScanner();
			System.out.println("");
			Stories.welcome(playerName, playerTitle, titleNum);//calls stories function to welcome player
			PickPath.firstPlay(playerName, playerTitle, titleNum, level, xp, coins);
		}
		
//		System.out.println("\n" + playerTitle[titleNum] + ": " + playerName);
//		System.out.println("Level: " + level + " (" + xp + "xp/" + nextLevel + "xp)");
		
		
		
		
		
//		playerName = GetInput.stringScanner();
//		System.out.println("[CLASS LEVEL + USERNAME] EX. KING JAMIN, PEASANT LUCAS");
//		System.out.println("[LEVEL + XP]");
//		System.out.println("[]");
	}
}
