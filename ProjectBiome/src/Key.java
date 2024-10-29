public class Key {
    private Room room;
    private String keyName;

    public Key(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyName() {
        return keyName;
    }

    public Room getRoom() {
        return room;
    }
}
