/**
* Class: Player
* @authors Ethan Ciota, Shalom Biswa, Ian Dewey, Shea Sullivan, Madeline Swisher, Lucas Williams-Heim
* @version 2.0
* Course : CSE 201 Fall 2024
* Written: Dec 2, 2024
*
* Purpose: – Describe class purpose and what it does
*/
import java.util.ArrayList;

public class Player {
    private String playerName; // name assignend to the player
    ArrayList<String> inventory; // Strings representing items held by the player

    public Player(String playerName) {
        this.playerName = playerName;
        inventory = new ArrayList<>();
        inventory.add("Sword");
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
    * Checks whether or not a key been obtain already or not
    * @param key
    * @return true if key is in inventory, false otherwise
    */
    public boolean checkKey(String key) {
    	for (String item : inventory) {
            if (item.equals(key)) {
            	return true;
            }
        }
    	return false;
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
