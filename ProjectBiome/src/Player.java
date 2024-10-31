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
}
