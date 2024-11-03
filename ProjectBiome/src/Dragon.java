public class Dragon {

    private String name;
    private int health;

    public Dragon(String name, int health) {
        this.name = name;
        this.health = health;
    }

    /**
    @param player that recieves damage
    Description: THe dragon attacks the player and reduces the players health
    **/
    public void attackPlayer(Player player) {
        // Attack player logic
    }

   /**
   @param damage: the amount of damage inflicted
   Description: Reduces the health by how much damage the dragon took
    **/
    public void takeDamage(int damage) {
        // Dragon takes damage
    }
}
