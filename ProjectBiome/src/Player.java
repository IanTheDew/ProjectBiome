public class Player {

    private String playerName;
    private Key[] keys;

    public Player(String playerName) {
        this.playerName = playerName;
        keys = new Key[5]; // Example for holding keys
    }

    public String getPlayerName() {
        return playerName;
    }

    public void collectKey(Key key) {
        // Logic for collecting keys
    }

    public void useKey() {
        // Logic for using keys
    }
}
