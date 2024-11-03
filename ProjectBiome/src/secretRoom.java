import java.util.Scanner;

public class secretRoom extends Rooms {
    
    /**
      	@param player navigating the secret room
        @param scanner to take input
	Description: Rooms and puzzles are navigated
	**/
    public static void roomActivity(Player player, Scanner scanner) {
        System.out.println("You are in a puzzle, will you successfully solve the puzzle (y)?");
        if (scanner.nextLine().equals("y")) {
            
        } else {
            
        }
    }

    /**
      	@param player navigating the secret room
        @param scanner to take input
	Description: Prompts for user input when entering the secret room
	**/
    public static void enterRoom(Player player, Scanner scanner) {
    	System.out.println("you fall into a hidden gold cache...");
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
      	@param player navigating the secret room
        @param scanner to take input
	Description: Prompts for user input when exiting the secret room
	**/
    public static void exitRoom(Player player, Scanner scanner) {
        lobbyRoom.enterRoom(player, scanner);
    }
    
}
