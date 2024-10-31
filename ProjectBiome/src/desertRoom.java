import java.util.scanner;

public class desertRoom implements Rooms {
    private String description = " see a never ending desert...";

    public void puzzle(Scanner scanner) {
        //puzzle game
        System.out.println("You are in a puzzle, enter y if you want to complete the puzzle");
        if (scanner.nextLine().equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void enterRoom() {
        // Room entering logic
    }

    @Override
    public void exitRoom() {
        // Room exiting logic
    }
    
}
