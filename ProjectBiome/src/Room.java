public abstract class Room implements Rooms {

    private String description;

    public Room(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void enterRoom() {
        // Room entering logic
    }

    @Override
    public void exitRoom() {
        // Room exiting logic
    }
}
