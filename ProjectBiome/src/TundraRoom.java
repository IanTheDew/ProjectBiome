import java.util.Scanner;

public class TundraRoom extends Rooms {
	
	/**
      	@param player navigating the tundra room
        @param scanner to take input
	Description: Rooms and puzzles are navigated
	**/
    public static void roomActivity(Player player, Scanner scanner) {
    	System.out.println(player.getPlayerName() + " comes across a large Igloo and decides to enter through the front.");
	System.out.println(player.getPlayerName() + " encounters a question inscribed at the end of a hallway.");
	System.out.println("The question reads \"How many sides does a snowflake have\", with an arrow pointing right with a 6 above it and an arrow pointing left with a 4 above it.");
	System.out.println("Which direction does " + player.getPlayerName() + " decide to go, right (r) or left (l)?");

	boolean validInput;
	do {
		String input = scanner.nextLine();
		validInput = true;
		
	        if (input.equalsIgnoreCase("r")) {
	        	System.out.println(player.getPlayerName() + " heads right at the end of the hallway and arrives at another question!");
			roomActivityPart2(player, scanner);
		} else if (input.equalsIgnoreCase("l")) {
			System.out.println(player.getPlayerName() + " heads left at the end of the hallway, but while they continue down the hallway they fall into a trap!");
			System.out.println(player.getPlayerName() + " awakes where their journey began, forgetting how they arrived back here.");
			exitRoom(player, scanner);
	        } else {
	        	System.out.println("Your input was not recognized by the system, please try again.");
			validInput = false;
	        }
		
	} while (! validInput);
    }

	/**
      	@param player navigating the tundra room
        @param scanner to take input
	Description: Prompts for user input when entering the tundra room
	**/
    public static void enterRoom(Player player, Scanner scanner) {
    	System.out.println(" see a vast tundra...");
    	boolean validInput;
        do {
        	validInput = true;
            System.out.println("Would you like to leave this room (l) or continue to the puzzle (p)?");
            String userInput = scanner.nextLine();
            
            if (userInput.equalsIgnoreCase("l")) {
                exitRoom(player, scanner);
            } else if (userInput.equalsIgnoreCase("p")) {
                roomActivity(player, scanner);
            } else {
                System.out.println("Your input was not recognized, please try again");
                validInput = false;
            }
        } while (!validInput);
    }

	/**
      	@param player navigating the tundra room
        @param scanner to take input
	Description: Prompts for user input when exiting the tundra room
	**/
    public static void exitRoom(Player player, Scanner scanner) {
    	LobbyRoom.enterRoom(player, scanner);
    }
    
}
