import java.util.Scanner;

public class ProjectBiome{

    public static void main (String[] args){
        // Set up initial game state
        private boolean gameOver = false;
        private long gameTime;

        // create player object with inputted name
        Scanner scanner = new Scanner(System.in);

        lobbyRoom.enterRoom();
        //This is main game loop
        do {

            //Switch case for user options/inputs
            
        } while (!gameOver);
        
    }    
    public void startGame() {
        //get game start time
        gameTime = System.nanoTime();

        //print main display
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║          Welcome to              ║");
        System.out.println("║         Project Biome!           ║");
        System.out.println("╚══════════════════════════════════╝\n");
        System.out.println("Hello traveler, what is your name?: ");
            
        //get user name and make player object
        String name = scanner.nextLine();
        Player player = new Player(name);
        
    }

    public void endGame() {
        // End game sequence
        gameOver = false;
        
        //get total game time
        gameTime = System.nanoTime() - gameTime;
        System.out.println("Thank you for playing. \nTotal game time: " + gameTime);
    }

    public void displayMenu() {
        // Display main menu options
    }

    public void chooseBiome() {
        // Biome selection logic
    }
}
