package ClamsToCrowns;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Planting {
	static int xp = 0;
	static int level = 0;
	static int wheatSeeds = 0;
	static int wheat = 0;
	static Map<String, Integer> seeds  = new HashMap<String, Integer>();//stores seed amounts
	static Map<String, Integer> plants  = new HashMap<String, Integer>();//stores plant amount
	
	public static void pickPlant(String playerNamePass, String[] playerTitlePass, int titleNumPass, int levelPass, int xpPass, int coins) {
		seeds.put("wheatSeed", 1);
		System.out.println("Seeds " + seeds.get("wheatSeed"));
		System.out.println("coins " + coins);
		Scanner input = new Scanner(System.in);
		int i = -1;
		do {
//			System.out.println("\n 3 - Plant Wheat");
			wheatSeeds = seeds.get("wheatSeed");
			
		     i = input.nextInt();
		     if (i == 3) {
		    	 if(wheatSeeds >= 1) {
					wheat();
		    	 } else {
		    		 System.out.println("You have no wheat seeds.");
					break;
		    	 }
		    	 
		     }
		} while(i != 0 && wheatSeeds >= 0);
		
	    	 
	}

	public static void wheat() {
			 Random rand = new Random();
			 wheatSeeds = seeds.get("wheatSeed");
	    	 wheatSeeds--;
	    	 
	    	 TimerTask task = new TimerTask() {
		         public void run() {
		        	 int randWheat = rand.nextInt(1) + 3;
		        	 int randWheatSeed = rand.nextInt(3);
		        	 wheat += randWheat;
		        	 wheatSeeds += randWheatSeed;
		        	 xp += 1;
		        	 System.out.println("\nWS: " + wheatSeeds + " W: " + wheat + " xp: " + xp);
		        	 System.out.println("\nrandWheat " + randWheat + " randWheatSeed " + randWheatSeed);
		        	 System.out.println("\nrandWheat " + randWheat + " randWheatSeed " + randWheatSeed);
		        	 System.out.println("\nrandWheat " + randWheat + " randWheatSeed " + randWheatSeed);
		        	 System.out.println("\nrandWheat " + randWheat + " randWheatSeed " + randWheatSeed);
		        	 System.out.println("\nrandWheat " + randWheat + " randWheatSeed " + randWheatSeed);
		        	 System.out.println("\nrandWheat " + randWheat + " randWheatSeed " + randWheatSeed);
		        	 System.out.println("\nrandWheat " + randWheat + " randWheatSeed " + randWheatSeed);
		        	 
		         }
		     };
		     Timer timer = new Timer("Timer");
		      
		     long delay = 5000;
		     timer.schedule(task, delay);
		     int count = 0;
		     System.out.print("Planting Wheat");
		     while(count < 3) {
		    	 	count++;
					try {
						Thread.sleep(1660);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
					System.out.print(".");
			}
	}

}


