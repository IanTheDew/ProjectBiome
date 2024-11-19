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

    /**
    Description: A getter that gets the player's name (this is user inputted)
    **/
    public String getPlayerName() {
        return playerName;
    }

    /**
    Description: A getter that prints out every item in the player's inventory
    **/
    public void getInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Your inventory is empty.");
        } else {
            System.out.println("Your inventory contains:");
            for (String item : inventory) {
                System.out.println("- " + item);
            }
        }
    }
    /**
    @param item that is added to the inventory array list
    Description: adds a key and/or weapon/other item to the inventory array list
    **/
    public void collectItem(String item) {
        inventory.add(item);
    }
    
    /**
    Description: This method determines if the final room can be entered or not by returning true if all keys are in the array list inventory
    **/
    public boolean hasAllKeys() {
    	return (inventory.contains("Desert Key") && inventory.contains("Tundra Key") && inventory.contains("Jungle Key"));
    }

    
}
