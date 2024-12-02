/**
* Class: DessertRoom
* @authors Ethan Ciota, Shalom Biswa, Ian Dewey, Shea Sullivan, Madeline Swisher, Lucas Williams-Heim
* @version 2.0
* Course : CSE 201 Fall 2024
* Written: Dec 2, 2024
*
* Purpose: Carries out the dessert room sequence in the game
*/

import java.util.Scanner;

public class DesertRoom {
	private static final String correctAnswer = "sandstorm"; // answer needed to solve the riddle in the puzzle section
	
	/**
  	@param player navigating the desert room
    @param scanner to take input
	Description: Prompts for user input when entering the desert room
	**/
	public static void enterRoom(Player player, Scanner scanner) {
		if (player.checkKey("Desert Key")) {
			System.out.println("You already have the desert key!");
			exitRoom(player, scanner);
    		}
		System.out.println("You step into the Desert Room. You feel the intense heat and see a pedestal in the center.");
		boolean validInput;
		do {
			validInput = true;
			System.out.println("Would you like to leave this room (enter L) or explore the pedestal (enter P)?");
			String userInput = scanner.nextLine();

			if (userInput.equalsIgnoreCase("l")) {
				exitRoom(player, scanner);
			} else if (userInput.equalsIgnoreCase("p")) {
				roomActivity(player, scanner);
			} else {
				System.out.println("Your input was not recognized, please try again.");
				validInput = false;
			}
		} while (!validInput);
	}

	/**
  	@param player navigating the desert room
    @param scanner to take input
	Description: Puzzle activity for the desert room
	**/
	public static void roomActivity(Player player, Scanner scanner) {
		System.out.println(player.getPlayerName() + " notices a key inside the pedestal locked behind a mysterious riddle.");
		System.out.println("To obtain the key, solve this riddle:");

		// Riddle prompt
		System.out.println("\"I am the desert’s fury, unseen but relentless. I shape the dunes, yet I leave no trace. What am I?\"");
		
		boolean puzzleSolved = false;
		
		while (!puzzleSolved) {
			System.out.print("Enter your answer (or type 'hint' for a clue): ");
			String playerInput = scanner.nextLine().trim();

			puzzleSolved = checkAnswer(playerInput);
		}
		
		player.collectItem("Desert Key");
		exitRoom(player, scanner);
	}
	
	/**
	 * Description: Checks the user's inputted answer for the puzzle section
	 */
	private static boolean checkAnswer(String input) {
		if (input.equalsIgnoreCase(correctAnswer)) {
			System.out.println("The pedestal clicks open, and you have obtained the Desert Key!");
			return true;
		} else if (input.equalsIgnoreCase("hint")) {
			giveHint();
		} else {
			System.out.println("That's not quite right. Try again or type 'hint' for help.");
		}
		return false;
	}
	
	/**
	 * Description: Gives the user a hint towards the riddle
	 */
	private static void giveHint() {
		System.out.println("Hint: It’s a force of nature, often fierce and blinding, but made of sand and wind.");
	}

	/**
	 * @param player navigating the desert room
	 * @param scanner to take input
	 * Description: Exits the desert room back to the lobby
	 */
	private static void exitRoom(Player player, Scanner scanner) {
		System.out.println(player.getPlayerName() + " leaves the Desert Room");
		LobbyRoom.enterRoom(player, scanner);
	}
}
