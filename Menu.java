
public class Menu {

    public static void displayStats(Character player) {
        System.out.println("Strength: " + player.attack);
        System.out.println("Defense: " + player.defense);
        System.out.println("Health: " + player.health);
    }

    public static void showInventory(Character player) {
        for (Item item : player.inventory) {
            System.out.println(item.name);
        }

    }
}
