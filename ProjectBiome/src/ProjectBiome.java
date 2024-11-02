import java.util.Scanner;

public class ProjectBiome{
	

    public static void main (String[] args){
    	long gameTime = startGame();
    	endGame(gameTime);
    }    
    
    public static long startGame() {
    	// Set up initial game state
        long gameTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);

        //print main display
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║          Welcome to              ║");
        System.out.println("║         Project Biome!           ║");
        System.out.println("╚══════════════════════════════════╝\n");
        System.out.println("Hello traveler, what is your name?: ");
            
        //get user name and make player object
        String name = scanner.nextLine();
        Player player = new Player(name);
        
        lobbyRoom.enterRoom(player, scanner);
        return gameTime;
    }

    public static void endGame(long gameTime) {
        //get total game time
        gameTime = System.nanoTime() - gameTime;
        System.out.println("Thank you for playing. \nTotal game time: " + gameTime);
    }
}
