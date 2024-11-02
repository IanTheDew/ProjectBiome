/*
 *This code is a class for the Player object
 *It allows us to  keep track of the players name, inventory, etc.
 *
 * @Author CSE 201 Group A
 */
import java.util.ArrayList;

public class Player {

    private String playerName;
    ArrayList<String> inventory;


    public Player(String playerName) {
        this.playerName = playerName;
        inventory = new ArrayList<>();
    }

    public String getPlayerName() {
        return playerName;
    }

    public void collectItem(String item) {
        inventory.add(item);
    }
    
    public boolean hasAllKeys() {
    	return (inventory.contains("Desert Key") && inventory.contains("Tundra Key") && inventory.contains("Jungle Key"));
    }
}
