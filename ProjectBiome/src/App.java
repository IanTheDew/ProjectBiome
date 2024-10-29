public class App {
    
    private boolean gameOver;
    private long gameTime;
    
    public App() {
        gameOver = false;
    }
    
    public void startGame() {
        //get game start time
        gameTime = System.nanoTime();

        //main game loop
        do {
            System.out.println("╔══════════════════════════════════╗");
            System.out.println("║          Welcome to              ║");
            System.out.println("║         Project Biome!           ║");
            System.out.println("╚══════════════════════════════════╝\n");
            System.out.println("Hello traveler, what is your name?: ");
            
            // create player object with inputted name
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            Player player = new Player(name);
            
            // moving on...

            
            

        } while(!gameOver);
    }

    public void endGame() {
        // End game sequence
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
