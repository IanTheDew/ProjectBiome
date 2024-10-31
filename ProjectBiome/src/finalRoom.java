import java.util.scanner;

public class finalRoom implements Rooms {
    
    @Override
    public static void enterRoom(Scanner scanner) {
        System.out.println(" a dragon emerges from the shadows...");
        do {
            boolean validInput = true;
            System.out.println("Would you like to continue to the boss fight (b)?");
            String userInput = scanner.nextLine();
        
            if (userInput.equals("b")) [
                roomActivity();
            } else {
                System.out.println("Your input was not recognized, please try again");
                validInput = false;
            }
        
        } while (!validInput);
    }

    @Override
    private static void roomActivity(Scanner scanner) {
        //puzzle game
        System.out.println("You are in the final boss fight, would you like to win? (y)");
        if (scanner.nextLine().equals("y")) {
            
        } else {
            exitRoom();
        }
    }

    @Override
    private void exitRoom(Scanner scanner) {
        win();
}
        
    
}
