public abstract class deserRoom implements Rooms {
    private boolean isLocked;
    private String description = " see a never ending desert...";

    public Room(String description, Boolean isLocked) {
        this.description = description;
        this.isLocked = isLocked;
    }

    public void puzzle() {
        //puzzle game
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