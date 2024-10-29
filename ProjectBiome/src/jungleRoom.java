public abstract class jungleRoom implements Rooms {
    private boolean isLocked;
    private String description = " see an expansive jungle...";

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
