public class App {

    boolean gameOver = false;
    long gameTime;
    public void startGame() {
        // Game loop and main game logic

        //get game start time
        gameTime = System.nanoTime();

        //main game loop
        while (!gameOver) {
            
        }
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
