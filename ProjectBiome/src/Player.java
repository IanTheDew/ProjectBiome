import java.util.ArrayList;

public class Player {

    private String playerName;
    ArrayList<String> invintory;


    public Player(String playerName) {
        this.playerName = playerName;
        invintory = new ArrayList<>();
    }

    public String getPlayerName() {
        return playerName;
    }

    public void collectKey(Key key) {
        keys[keyIndex] = key;
        keyIndex++;
    }
}
