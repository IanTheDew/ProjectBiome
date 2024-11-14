import java.util.Scanner;

public class DesertRoom extends Rooms {

     	/**
      	@param player navigating the desert room
        @param scanner to take input
	Description: Room and puzzles are navigated
	**/
	private static void roomActivity(Player player, Scanner scanner) {
        System.out.println("You are in a puzzle, will you successfully solve the puzzle (y)?");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
        	System.out.println("Congrats! You have solved the puzzle and obtained the Desert Key!");
        	player.collectItem("Desert Key");
        	exitRoom(player, scanner);
        	
        } else {
        	
        	boolean validInput;
        	
        	do {
        		validInput = true;
	            System.out.println("You have failed the puzzle! Would you like to retry (r) or exit back to the lobby (n)?");
	            String input = scanner.nextLine();
	            if (input.equalsIgnoreCase("r")) {
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
      	@param player navigating the desert room
        @param scanner to take input
	Description: Prompts for user input when entering the desert room
	**/
     public static void enterRoom(Player player, Scanner scanner) {
         System.out.println("you see a never ending desert...");
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
      	@param player navigating the desert room
        @param scanner to take input
	Description: Prompts for user input when exiting the desert room
	**/
    private static void exitRoom(Player player, Scanner scanner) {
        lobbyRoom.enterRoom(player, scanner);
    }
    
}
