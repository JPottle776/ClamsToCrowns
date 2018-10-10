package ClamsToCrowns;
import java.util.ArrayList;
import java.util.List;

/*
 * Author: Jamin Pottle and Lucas Eastman
 * Date: October 3rd, 2018
 * 
 * Stories.java
 */
public class Stories {
	//function for welcoming player
	public static void welcome(String playerName, String[] playerTitle, int titleNum) {
//		List<String> welcome = new ArrayList<>();
		String welcome[] = new String[] {};
		String welcomeString = "Welcome " + playerName + ", to Clams to Crowns. You are a " + playerTitle[titleNum] + ". Don't worry though you won't be one long you will either die a Slave or become a Ruler of your own Kingdom. Doesn't sound to bad right...Let's find out.";
		welcome = welcomeString.split("");
		for (int i = 0; i < welcome.length; i++) {//prints out welcome a letter at a time
            
            if(i >= 100 && i <= 105 && welcome[i].matches(" ")) {
            	System.out.print("\n");
            } else {
            	System.out.print(welcome[i]);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
		
		
	}
}
