import java.util.Scanner;

public class secretRoom extends Rooms {
    
    public static void roomActivity(Player player, Scanner scanner) {
        System.out.println("You are in a puzzle, will you successfully solve the puzzle (y)?");
        if (scanner.nextLine().equals("y")) {
            
        } else {
            
        }
    }
    
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

   
    public static void exitRoom(Player player, Scanner scanner) {
        lobbyRoom.enterRoom(player, scanner);
    }
    
}
