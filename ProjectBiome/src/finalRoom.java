import java.util.Scanner;

public class finalRoom {
    
	private static void roomActivity(Player player, Scanner scanner) {
        System.out.println("You are in the final boss fight, would you like to win? (y)");
        if (scanner.nextLine().equals("y")) {
            System.out.println("Congrats! You have beaten Project Biome!");
        } else {
        	System.out.println(player.getPlayerName() + " awakes in the lobby room after being defeated by the dragon");
            exitRoom(player, scanner);
        }
    }
	
    public static void enterRoom(Player player, Scanner scanner) {
        System.out.println(" a dragon emerges from the shadows...");
        boolean validInput;
        do {
            validInput = true;
            System.out.println("Would you like to continue to the boss fight (b)!??!? There is no backing out now!");
            String userInput = scanner.nextLine();
        
            if (userInput.equals("b")) {
                roomActivity(player, scanner);
            } else {
                System.out.println("Your input was not recognized, please try again");
                validInput = false;
            }
        
        } while (!validInput);
    }

    private static void exitRoom(Player player, Scanner scanner) {
        lobbyRoom.enterRoom(player, scanner);
    }
        
    
}
