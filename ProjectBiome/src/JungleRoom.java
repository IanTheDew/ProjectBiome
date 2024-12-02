// THIS IS RANDOM GENERATOR CODE I MIGHT USE IN THE FUTURE - shea
// private static boolean puzzleSolved = false;
// Random rand = new Random();
	
// int endCond = 0; // once this reaches 3, the puzzle is complete
// Random rand = new Random();
// int rand_roll = rand.nextInt(3) + 1;
// while(endCond != 3)
// {
// 	if(rand_roll == 1 || rand_roll == 3)
// 	{
// 		System.out.print("You missed. How unfortunate.");
// 	}
// 	if(rand_roll == 2)
// 	{
// 		endCond++;
// 		System.out.print("Hit! Good going, " + player.getPlayerName() + ". ");
// 		puzzleSolved = true;
// 	}
// }
import java.util.Scanner;

public class JungleRoom {	
	/**
      	@param player navigating the room
        @param scanner to take input
	Description: Room and puzzles are navigated
	**/
    public static void roomActivity(Player player, Scanner scanner) {
    	
	boolean complete = false; // if room was completed
	char choice;
	
	do {
		displayMenu();
		choice = scanner.nextLine().charAt(0);
	    switch (choice) {
		case 'F':
		     // do room activity
		    System.out.println("You engage the goblins, they look at you menacingly");
		    System.out.println("With your sword drawn, you feel a surge of confidence. The goblin leader sneers, but you stand your ground.");
		    System.out.println("The other goblins hesitate, clearly intimidated by your weapon. Do you:");
		    System.out.println("1. Charge at the goblins with a fierce battle cry! (enter C)");
		    System.out.println("2. Attempt to negotiate with the goblins, offering them treasure for safe passage. (enter N)");
		    choice = scanner.nextLine().charAt(0);
		    switch (choice) {
			case 'C':
				System.out.println("You charge at the goblins with a battle cry! They scatter in fear, throwing they key at you as they run away.");
				player.collectItem("Jungle Key");
			    	complete = true;
			    	break;
			case 'N':
				System.out.println("You offer the goblins some treasure. They consider your proposal and ultimately trade their key for it.");
				player.collectItem("Jungle Key");
				complete = true;
				break;
			default:
			    	System.out.println("Confused, you hesitate, and the goblins take the opportunity to surround you!");
			    	break;
		    }
		    break;
		case 'L':
			// leave the room
			System.out.println("You spot a nearby bush and make a break for it! You escape into the jungle, leaving the goblins behind.");
			complete = true;
		    break;
		case 'O':
			// get keys from inventory
		    System.out.println("Opening inventory...");
		    player.getInventory();
		    break;
		case 'Q':
			// quit the game (in reality just exits the room)
		    System.out.println("Quitting the game...");
		    complete = true;
		    break;
		default:
		    System.out.println("Input not recognized, please try again.");
	    }
	} while (!complete);
		
		// exit the room if complete
    	exitRoom(player, scanner);
    }
    /**
      	@param player navigating the jungle room
        @param scanner to take input
	Description: Prompts for user input when entering the jungle room
	**/
    public static void enterRoom(Player player, Scanner scanner) {
    	// check if player already has the key..
    	if (player.checkKey("Jungle Key")) {
		System.out.println("You already have the jungle key!");
		exitRoom(player, scanner);
    	}
    	
    	// print a description of the room
    	System.out.println("You walk through the green door into a large open and lush jungle. \n" +
	    "You encounter a group of green goblins where you can see \n"
	    + "the leader has the green key hanging from a necklace around their neck.\n");
    	
        boolean validInput;
        do {
        	validInput = true;
	    System.out.println("Would you like to leave this room (l) or engage the goblins (p)?");
	    String userInput = scanner.nextLine();
            
            if (userInput.equalsIgnoreCase("l")) {
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
    	System.out.println("Player '" + player.getPlayerName() + "' is leaving the Jungle Room");
        LobbyRoom.enterRoom(player, scanner);
    }
    
    // provide the user with list of things they can do
    public static void displayMenu() {
    	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~*~ Jungle Encounter ~*~                 ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                  What will you do?:                     ");
        System.out.println("----------------------------------------------------------");
        System.out.println("|  1. Fight the goblins... (press F)                     |");
        System.out.println("|  2. Flee... (press L)                                  |");
        System.out.println("|  3. Open Your Inventory... (press O)                   |");
        System.out.println("|  4. Quit the game... (press Q)                         |");
        System.out.println("----------------------------------------------------------");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Choose an option: ");
    }
}
