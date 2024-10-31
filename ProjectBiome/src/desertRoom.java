import java.util.scanner;

public class desertRoom implements Rooms {
    
    @Override
    public void enterRoom(Scanner scanner) {
        System.out.println("you see a never ending desert...");
        do {
            boolean validInput = true;
            System.out.println("Would you like to leave this room (l) or continue to the puzzle (p)?");
            String userInput = scanner.nextLine();
            
            if (userInput.equals("l")) {
                exitroom();
            } else if (userInput.equals("p")) [
                puzzle();
            } else {
                System.out.println("Your input was not recognized, please try again");
                validInput = false;
            }
        } while (!validInput);
    }

    @Override
     private static void roomActivity(Scanner scanner) {
        //puzzle game
        System.out.println("You are in a puzzle, enter y if you wish to successfully complete the puzzle");
        if (scanner.nextLine().equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    private void exitRoom() {
        lobbyRoom.enterRoom(scanner);
    }
    
}
