package ClamsToCrowns;

public class PickPath {
	public static void firstPlay(String playerName, String[] playerTitle, int titleNum, int level, int xp, int coins) {
		System.out.println("\n");
		String splitWarning[] = new String[] {};
		String warning = "hi";//"Since you are a Slave and have nothing I will give you one coin to start you out in this life. You can buy Wheat seeds with that coin or you can gamble it to try and get more coins. But beware you are more likely to lose your coin then you are to gain more. If you lose your coin you will have 7 years added to your slave sentence but if you gain more coins you will be able to afford more seed...The choice is yours. You have " + coins + " coinQ 1 - Buy Wheat Seed\n 2 - Gamble Coin";
		splitWarning = warning.split("");
		for (int i = 0; i < splitWarning.length; i++) {//prints out warning a letter at a time
            
			//if statements for line breaks in console - needs to be changed later
            if(i >= 100 && i <= 105 && splitWarning[i].matches(" ")) {
            	System.out.print("\n");
            } else if(i >= 200 && i <= 204 && splitWarning[i].matches(" ")) {
            	System.out.print("\n");
            } else if(i >= 300 && i <= 304 && splitWarning[i].matches(" ")) {
            	System.out.print("\n");
            } else if(i >= 400 && i <= 404 && splitWarning[i].matches(" ")) {
            	System.out.print("\n");
            } else if(i >= 400 && splitWarning[i].matches("Q")) {
            	System.out.print("\n");
            } else {
            	System.out.print(splitWarning[i]);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
		int choice = 0;
		do {
//			System.out.println("\n Coins: " + coins);
			System.out.println("");
			choice = GetInput.intScanner();
			if(choice == 1){
				//buy seeds
				coins--;
				Planting.pickPlant(playerName, playerTitle, titleNum, level, xp, coins);
			} else if(choice == 2) {
				//gamble
			} else {
				System.out.println("That is not a choice avalible\n 1 - Buy Wheat Seed\n 2 - Gamble Coin\n");
			}
		} while(choice != 1 || choice != 2);
		
		
	}
}
