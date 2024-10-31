import java.util.Scanner;

public class Jungle implements Rooms {
	private String description;
	private boolean hasSword;
	private boolean complete = false;
	// global scanner
	Scanner input = new Scanner(System.in);
	
	public Jungle(boolean hasSword) {
		description = "You walk through the green door into a large open and lush jungle. \n" +
	    "You encounter a group of green goblins where you can see \n"
	    + "the leader has the green key hanging from a necklace around their neck.\n";
		this.hasSword = hasSword;
	}
    
    public void puzzle() {
        System.out.println("You engage the goblins, they look at you menacingly");
        if (hasSword) {
            System.out.println("With your sword drawn, you feel a surge of confidence. The goblin leader sneers, but you stand your ground.");
            System.out.println("The other goblins hesitate, clearly intimidated by your weapon. Do you:");
            System.out.println("1. Charge at the goblins with a fierce battle cry! (press C)");
            System.out.println("2. Attempt to negotiate with the goblins, offering them treasure for safe passage. (press N)");
            char choice = input.nextLine().charAt(0);
            switch (choice) {
                case 'C':
                    System.out.println("You charge at the goblins with a battle cry! They scatter in fear, throwing they key at you as they run away.");
                    complete = true;
                    break;
                case 'N':
                    System.out.println("You offer the goblins some treasure. They consider your proposal and ultimately trade their key for it.");
                    complete = true;
                    break;
                default:
                    System.out.println("Confused, you hesitate, and the goblins take the opportunity to surround you!");
                    break;
            }
        } else {
            System.out.println("Without a weapon, you feel vulnerable. The goblins inch closer, their expressions twisted into malicious grins.");
            System.out.println("You have a few options to consider:");
            System.out.println("1. Try to talk your way out of the encounter. (press T)");
            System.out.println("2. Look for a way to escape and flee into the jungle. (press F)");
            System.out.println("3. Prepare to defend yourself with whatever you can find nearby. (press D)");
            char choice = input.nextLine().charAt(0);
            switch(choice) {
                case 'T':
                    System.out.println("You try to talk your way out of the encounter. The goblins laugh and strike you down.");
                    break;
                case 'F':
                    System.out.println("You spot a nearby bush and make a break for it! You escape into the jungle, leaving the goblins behind.");
                    break;
                case 'D':
                    System.out.println("You grab a nearby stick. The goblins laugh, saying, 'What’s that, a toothpick?'");
                    System.out.println("You start swinging it wildly, making them laugh so hard that the goblin leader drops the key!");
                    System.out.println("You quickly snatch it up while they’re distracted!");
                    complete = true;
                    break;
                default:
                    System.out.println("Your indecision costs you, and the goblins rush at you!");
                    break;
            }
	    }
	}

		   
    public void enterRoom() {
        // Room entering logic
        System.out.println(description);
        displayMenu();
        
        char choice = input.nextLine().charAt(0);
        switch (choice) {
            case 'F':
                System.out.println("Time to fight!");
                puzzle(); // do room activity
                break;
            case 'L':
                System.out.println("Time to flee!");
                break;
            case 'O':
                System.out.println("Opening inventory...");
                break;
            case 'Q':
                System.out.println("Quitting the game...");
                break;
            default:
                System.out.println("Input not recognized...");
        }
        exitRoom();
    }

    public void exitRoom() {
        // Room exiting logic
        if (complete) {
            System.out.println("You triumphantly hold the key aloft, shouting, 'I got the key! Time to head back and unlock that door!' ");
            System.out.println("The goblins groan in defeat as you strut away, feeling like a hero in your very own adventure story.");
        } else {
            System.out.println("You sigh dramatically, saying, 'I lost... Perhaps I should have stuck with my trusty stick instead of trying to impress them.'");
            System.out.println("The goblins chuckle at your misfortune, reminding you that sometimes it's best to choose laughter over bravado.");
        }
    }

		
    public void displayMenu() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                ~*~ Jungle Encounter ~*~                 ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                  What will you do?:                     ");
        System.out.println("----------------------------------------------------------");
        System.out.println("|  1. Fight the goblins... press F                       |");
        System.out.println("|  2. Flee... press L                                    |");
        System.out.println("|  3. Open Your Inventory... press O                     |");
        System.out.println("|  4. Quit the game... press Q                           |");
        System.out.println("----------------------------------------------------------");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Choose an option: ");
    }
}
