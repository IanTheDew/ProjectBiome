import java.util.Scanner;
import java.util.Random;

public class JungleRoom extends Rooms 
{
	private static boolean puzzleSolved = false;
	Random rand = new Random();
	
	/**
      	@param player navigating the room
        @param scanner to take input
	Description: Room and puzzles are navigated
	**/
    public static void roomActivity(Player player, Scanner scanner) 
	{
    	System.out.println("You are in a puzzle, will you attempt to solve the puzzle (y)?");
        if (scanner.nextLine().equals("y")) 
	{
		System.out.println("There are enemies in front of you. Attack?");
		if(scanner.nextLine().equalsIgnoreCase("y")
		   {
			int endCond = 0; // once this reaches 3, the puzzle is complete
			int rand_roll = rand.nextInt(3) + 1
			while(endCond != 3)
			{
				if(rand_roll.equals(1) || rand_roll.equals(3))
				{
					System.out.print("You missed. How unfortunate.")
				}
				if(rand_roll.equals(2))
				{
					endCond++;
					System.out.print("Hit! Good going, " + player.name + ". ");
				}
			}
			puzzleSolved = true;
		   }
		
        	System.out.print("The enemy is down. There is a key around its neck. You take it.");
        	player.collectItem("Jungle Key");
		System.out.print("The Jungle Key is in your possession and you return to the lobby."
        	exitRoom(player, scanner);
        	
        } else {
        	
        	boolean validInput;
        	
        	do {
        		validInput = true;
	            System.out.println("Would you like to retry (r) or exit back to the lobby (n)?");
	            String input = scanner.nextLine();
	            if (input.equalsIgnoreCase("r")) {
	            	roomActivity(player, scanner);
	            } else if (input.equalsIgnoreCase("n")) {
	            	exitRoom(player, scanner);
	            } else {
	            	System.out.println("Your input was not recognized, please try again");
	            	validInput = false;
	            }
        	} while (!validInput);
        }
    }
    /**
      	@param player navigating the jungle room
        @param scanner to take input
	Description: Prompts for user input when entering the jungle room
	**/
    public static void enterRoom(Player player, Scanner scanner) {
        System.out.println(" see an expansive jungle...");
        boolean validInput;
        do {
        	validInput = true;
            System.out.println("Would you like to leave this room (l) or continue to the puzzle (p)?");
            String userInput = scanner.nextLine();
            
            if (userInput.equalsIgnoreCase("l")) {
                exitRoom(player, scanner);
            } else if (userInput.equals("p")) {
                roomActivityIgnoreCase(player, scanner);
            } else {
                System.out.println("Your input was not recognized, please try again");
                validInput = false;
            }
        } while (!validInput);
        
    }

/**
      	@param player navigating the jungle room
        @param scanner to take input
	Description: Prompts for user input when exiting the jungle room
	**/
    public static void exitRoom(Player player, Scanner scanner) {
        lobbyRoom.enterRoom(player, scanner);
    }
    
}
