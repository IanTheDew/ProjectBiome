/**
* Class: FinalRoom
* @authors Ethan Ciota, Shalom Biswa, Ian Dewey, Shea Sullivan, Madeline Swisher, Lucas Williams-Heim
* @version 2.0
* Course : CSE 201 Fall 2024
* Written: Dec 2, 2024
*
* Purpose: Carries out the final/boss room sequence in the game
*/

import java.util.Scanner;

public class FinalRoom {

	/**
	@param player navigating the final room
	@param scanner to take input
	Description: Prompts for user input when entering the final room
	**/	
	public static void enterRoom(Player player, Scanner scanner) {
		System.out.println("A low rumble echoes through the cavern, and your footsteps falter as the sound grows louder.");
		System.out.println("From the depths of the shadows, two piercing eyes suddenly ignite like embers in the dark.");
		System.out.println("The ground trembles as a massive form emerges, scales glinting faintly as the dragon steps forward.");
		System.out.println("Its wings unfurl slightly, brushing against the walls, and a guttural growl fills the air, shaking you to your core.");
		System.out.println("This is it—the final challenge. The dragon rears its head, flames licking at the edges of its mouth, ready to strike.");
		
        	boolean validInput;
		
        	do {
	        	validInput = true;
	        	System.out.println("Would you like to continue to the boss fight (enter B)!??!? There is no backing out now!");
	        	String userInput = scanner.nextLine();
	        	if (userInput.equalsIgnoreCase("b")) {
	                	roomActivity(player, scanner);
	        	} else {
	        		System.out.println("Your input was not recognized, please try again");
	                validInput = false;
	        	}
       		} while (!validInput);
	}
	
	/**
	@param player navigating the final room
	@param scanner to take input
	Description: Room activity and puzzles are navigated
	**/
	private static void roomActivity(Player player, Scanner scanner) {
		boolean complete = false; // if room was completed
		boolean success = false; // if the room was completed and resulted in victory
		char choice;
		
		do {
			displayMenu();
			choice = scanner.nextLine().toUpperCase().charAt(0);
		    switch (choice) {
		    	case 'F':
	                System.out.println("You draw your weapon and prepare to face the dragon!");
	                System.out.println(" - Attack (press A)");
	                System.out.println(" - Study the dragon's movements (press S)");
	                System.out.println(" - Defend against the dragon's attack (press D)");
	                System.out.print("Enter your choice: ");

	                choice = scanner.next().toUpperCase().charAt(0);
	                
	                
	                switch (choice) {
		                case 'A':
		                    System.out.println("You lunge forward, striking the dragon with all your might!");
		                    System.out.println("The dragon lets out a deafening roar before collapsing. You win!");
		                    complete = true;
		                    success = true;
		                    break;
	
		                case 'S':
		                    System.out.println("You focus intently on the dragon, noticing a weak spot in its scales.");
		                    System.out.println("With newfound knowledge, you strike a precise blow and defeat the dragon. You win!");
		                    complete = true;
		                    success = true;
		                    break;
	
		                case 'D':
		                    System.out.println("You brace yourself, trying to withstand the dragon's fiery breath.");
		                    System.out.println("The flames overwhelm you, and you are defeated. You lose.");
		                    complete = true;
		                    break;
	
		                default:
		                    System.out.println("You hesitate, and the dragon takes advantage of your inaction!");
		                    System.out.println("The dragon attacks relentlessly, and you are defeated. You lose.");
		                    complete = true;
		                    break;
	                }
	                break;

		    	case 'L':
	                System.out.println("You attempt to flee the lair... ");
	                System.out.println("You run under the dragon, barely escaping the dungeon");
	                complete = true;
	                break;

		    	case 'O':
	                System.out.println("Opening inventory...");
	                player.getInventory();
	                break;

		    	default:
	                System.out.println("Invalid choice. The dragon watches you hesitate, amused...");
	                break;
		    }
		} while (!complete);
		
		if (! success) {
			exitRoom(player, scanner);
		}
	}


	/**
	@param player navigating the final room
	@param scanner to take input
	Description: Prompts for user input when exiting the final room
	**/
	private static void exitRoom(Player player, Scanner scanner) {
		System.out.println(player.getPlayerName() + " leaves the Boss Room unsuccessful");
		LobbyRoom.enterRoom(player, scanner);
	}	
	
	/**
	* Description: prints a menu with user options
  	*/
	private static void displayMenu() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("                ~*~ The Dragon's Lair ~*~                ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("----------------------------------------------------------");
		System.out.println("|  1. Face the dragon head-on... (press F)               |");
		System.out.println("|  2. Attempt to flee the lair... (press L)              |");
		System.out.println("|  3. Open your inventory... (press O)                   |");
		System.out.println("----------------------------------------------------------");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("Choose your destiny: ");
	}

}
