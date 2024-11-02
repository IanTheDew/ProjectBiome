import java.util.Scanner;

public class jungleRoom extends Rooms {

    public static void roomActivity(Player player, Scanner scanner) {
    	System.out.println("You are in a puzzle, will you successfully solve the puzzle (y)?");
        if (scanner.nextLine().equals("y")) {
        	System.out.println("Congrats! You have solved the puzzle and obtained the Jungle Key!");
        	player.collectItem("Jungle Key");
        	exitRoom(player, scanner);
        	
        } else {
        	
        	boolean validInput;
        	
        	do {
        		validInput = true;
	            System.out.println("You have failed the puzzle! Would you like to retry (r) or exit back to the lobby (n)?");
	            String input = scanner.nextLine();
	            if (input.equals("r")) {
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
    
    public static void enterRoom(Player player, Scanner scanner) {
        System.out.println(" see an expansive jungle...");
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
