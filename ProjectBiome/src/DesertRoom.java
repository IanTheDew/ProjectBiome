import java.util.Scanner;

public class DesertRoom Rooms {
	private static final String correctAnswer = "sandstorm";
	private static boolean puzzleSolved = false;

	public static void enterRoom(Player player, Scanner scanner) {
		System.out.println("You step into the Desert Room. You feel the intense heat and see a pedestal in the center.");
		boolean validInput;
		do {
			validInput = true;
			System.out.println("Would you like to leave this room (l) or attempt to solve the puzzle (p)?");
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

	public static void roomActivity(Player player, Scanner scanner) {
		System.out.println(Player.getPlayerName() + " notices a key inside the pedestal locked behind a mysterious riddle.");
		System.out.println("To obtain the key, solve this riddle:");

		// Riddle prompt
		System.out.println("\"I am the desert’s fury, unseen but relentless. I shape the dunes, yet I leave no trace. What am I?\"");

		while (!puzzleSolved) {
			System.out.print("Enter your answer (or type 'hint' for a clue): ");
			String playerInput = scanner.nextLine().trim();

			checkAnswer(playerInput, player, scanner);
		}
	}

	private static void checkAnswer(String input, Player player, Scanner scanner) {
		if (input.equalsIgnoreCase(correctAnswer)) {
			puzzleSolved = true;
			System.out.println("The pedestal clicks open, and you have obtained the Desert Key!");
			player.collectItem("Desert Key");
			exitRoom(player, scanner);
		} else if (input.equalsIgnoreCase("hint")) {
			giveHint();
		} else {
			System.out.println("That's not quite right. Try again or type 'hint' for help.");
		}
	}

	private static void giveHint() {
		System.out.println("Hint: It’s a force of nature, often fierce and blinding, but made of sand and wind.");
	}

	private static void exitRoom(Player player, Scanner scanner) {
		System.out.println("You leave the Desert Room and return to the lobby.");
		LobbyRoom.enterRoom(player, scanner);
	}
}
