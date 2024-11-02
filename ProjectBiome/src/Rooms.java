/*
 * This code is a parent class for all of the rooms
 * Functionally it acts similar to an interface,
 * due to its abstract modifier and empty method bodies
 * 
 * Since it is not an interface, we can call on the methods in the subclasses 
 * without creating instances of them (something we cannot do with an interface)
 * 
 * @Author CSE 201 Group A
 */
import java.util.Scanner;

public abstract class Rooms {
    public static void enterRoom(Player player, Scanner scanner) {}
    private static void exitRoom(Player player, Scanner scanner) {}
    private static void roomActivity(Player player, Scanner scanner) {}
}
