import java.util.Scanner;

public class LobbyRoom extends Rooms  {

	/**
	@param player navigating the lobby room
	@param scanner to take input
	Description: Rooms and puzzles are navigated
	**/
    public static void RoomActivity(Player player, Scanner scanner) {
    	boolean validInput;
    	
		do {
			validInput = true;
	        	System.out.println("Would you like to enter the blue door (b), green door (g), or yellow door (y) or appraoch the gate (a)?");
	        	String input = scanner.nextLine();
	        
		        if (input.equalsIgnoreCase("b")) {
		            tundraRoom.enterRoom(player, scanner);
		        } else if (input.equalsIgnoreCase("g")) {
		            jungleRoom.enterRoom(player, scanner);
		        } else if (input.equals("y")) {
		        	desertRoom.enterRoom(player, scanner);
		        } else if (input.equalsIgnoreCase("a")) {
		        	if (player.hasAllKeys()) {
		        		finalRoom.enterRoom(player, scanner);
		        	} else {
		        		System.out.println("You don't have the required keys to enter this area!!");
		        		validInput = false;
		        	}
		        } else {
		        	System.out.println("Your input was not recognized, please try again");
		        	validInput = false;
		        }
		} while (!validInput);
		
    }
	/**
      	@param player navigating the lobby room
        @param scanner to take input
	Description: Prompts for user input when entering the lobby room
	**/
    public static void enterRoom (Player player, Scanner scanner) {
        // Room entering logic
    	System.out.println("you see a long hallway with three doors and a large gate requiring three keys...");
    	roomActivity(player, scanner);
    }
    
}
