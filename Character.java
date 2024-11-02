import java.util.ArrayList;

//parent Character class
public class Character {
    int attack;
    int defense;
    int health;
    String name;
    //array list to hold items
    ArrayList<Item> inventory;
    Item equippedWeapon;

    //this parent constructor will be used to assign class values
    public Character(int attack, int defense, int health, String name) {
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.name = null;
        this.inventory = new ArrayList<Item>();
        this.equippedWeapon = null;
    }

    public static void equipWeapon(Character player, Item weapon) {
        player.equippedWeapon = weapon;
        player.attack = player.attack + weapon.attack;
    }
}
//creates child class, base (default)
class Base extends Character {

    public Base() {
        super(10, 10, 100, null);
        //creates new Rock instance
        Rock rock = new Rock();
        //Gives Base class rock in inventory
        inventory.add(rock);
    }
}

//first enemy
class Wretch extends Character {

    public Wretch() {
        super(15, 0, 10, null);
    }
}