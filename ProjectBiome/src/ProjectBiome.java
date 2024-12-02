/**
* Class: ProjectBiome
* @authors Ethan Ciota, Shalom Biswa, Ian Dewey, Shea Sullivan, Madeline Swisher, Lucas Williams-Heim
* @version 2.0
* Course : CSE 201 Fall 2024
* Written: Dec 2, 2024
*
* Purpose: Contains the main method and initiates the start of the game and helps with the end of game sequence
*/


import java.util.Scanner;

public class ProjectBiome{
	
    public static void main (String[] args){
    	long gameTime = startGame();
    	endGame(gameTime);
    }  
	
    /**
    Description: starts the game and collects the time it takes the player to finish, entering the lobby room, and prints the welcome prompt
    **/
    public static long startGame() {
    	// Set up initial game state
        long gameTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);

        //print main display
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║          Welcome to              ║");
        System.out.println("║         Project Biome!           ║");
        System.out.println("╚══════════════════════════════════╝\n");
        System.out.println("Press Enter to start");
        scanner.nextLine();
        System.out.println("Hello traveler, what is your name?: ");
            
        //get user name and make player object
        String name = scanner.nextLine();
        Player player = new Player(name);
	    
	System.out.println(player.getPlayerName() + " begins their journey with nothing but the clothes on their back and a sword held in a sheath");
		
        LobbyRoom.enterRoom(player, scanner);
        return gameTime;
    }
    
    /**
    Description: ends the game, prints the total playtime, and prompts the end message
    **/
    public static void endGame(long gameTime) {
        //get total game time
        gameTime = System.nanoTime() - gameTime;
        int gameTimeSeconds = (int)(gameTime / 1e9d);
        System.out.println("Thank you for playing. \nTotal game time: " + gameTimeSeconds + " seconds");
    }
}

