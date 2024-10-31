import java.util.scanner;

public class lobbyRoom implements Rooms {
    private String description = "you see a long hallway with three doors and a large gate requiring three keys...";

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
