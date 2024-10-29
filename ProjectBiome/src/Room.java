public abstract class Room implements Rooms {
    private boolean isLocked;
    private String description;

    public Room(String description, Boolean isLocked) {
        this.description = description;
        this.isLocked = isLocked;
    }

    public String getDescription() {
        return description;
    }

    public boolean isLocked() {
        return isLocked;
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
