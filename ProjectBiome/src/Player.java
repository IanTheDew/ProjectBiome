public class Player {

    private String playerName;
    boolean jungleKey;
    boolean desertKey;
    boolean tundraKey;


    public Player(String playerName) {
        this.playerName = playerName;
        jungleKey = false;
        desertKey = false;
        tundraKey = false;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void collectKey(Key key) {
        keys[keyIndex] = key;
        keyIndex++;
    }
}
