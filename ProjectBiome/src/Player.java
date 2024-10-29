public class Player {

    private String playerName;
    private Key[] keys;
    private int keyIndex;

    public Player(String playerName) {
        this.playerName = playerName;
        keys = new Key[5]; // Example for holding keys
        keyIndex = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void collectKey(Key key) {
        keys[keyIndex] = key;
        keyIndex++;
    }
}
