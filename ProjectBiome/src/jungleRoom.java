import java.util.Scanner;

public class jungleRoom extends Rooms {
/**
      	@param player navigating the room
        @param scanner to take input
	Description: Room and puzzles are navigated
	**/
    public static void roomActivity(Player player, Scanner scanner) {
    	System.out.println("You are in a puzzle, will you successfully solve the puzzle (y)?");
        if (scanner.nextLine().equals("y")) {
        	System.out.println("Congrats! You have solved the puzzle and obtained the Jungle Key!");
        	player.collectItem("Jungle Key");
        	exitRoom(player, scanner);
        	
        } else {
        	
        	boolean validInput;
        	
        	do {
        		validInput = true;
	            System.out.println("You have failed the puzzle! Would you like to retry (r) or exit back to the lobby (n)?");
	            String input = scanner.nextLine();
	            if (input.equals("r")) {
	            	roomActivity(player, scanner);
	            } else if (input.equals("n")) {
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
            
            if (userInput.equals("l")) {
                exitRoom(player, scanner);
            } else if (userInput.equals("p")) {
                roomActivity(player, scanner);
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
