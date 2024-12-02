import java.util.Scanner;

public class LobbyRoom {

	/**
      	@param player navigating the lobby room
        @param scanner to take input
	Description: Prompts for user input when entering the lobby room
	**/
    public static void enterRoom (Player player, Scanner scanner) {
        // Room entering logic
    	System.out.println(player.getPlayerName() + " arrives at the room with three colored doors and a spiriling staircase leading to a locked door");
    	roomActivity(player, scanner);
    }
    

	/**
	@param player navigating the lobby room
	@param scanner to take input
	Description: Rooms and puzzles are navigated
	**/
    public static void roomActivity(Player player, Scanner scanner) {
    	boolean validInput;
    	
		do {
			validInput = true;
	        	System.out.println("Would you like to enter the blue door (enter B), green door (enter G), or yellow door (enter Y) or try the locked door (enter L)?");
	        	String input = scanner.nextLine();
	        
		        if (input.equalsIgnoreCase("b")) {
		            TundraRoom.enterRoom(player, scanner);
		        } else if (input.equalsIgnoreCase("g")) {
		            JungleRoom.enterRoom(player, scanner);
		        } else if (input.equals("y")) {
		        	DesertRoom.enterRoom(player, scanner);
		        } else if (input.equalsIgnoreCase("l")) {
		        	if (player.hasAllKeys()) {
		        		FinalRoom.enterRoom(player, scanner);
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
}
