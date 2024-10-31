import java.util.scanner;

public class secretRoom implements Rooms {
    private String description = "you fall into a hidden gold cache...";

    public void puzzle(Scanner scanner) {
        //puzzle game
    System.out.println("You are in a puzzle, enter y if you wish to successfully complete the puzzle");
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
