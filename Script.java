//import scanner
import java.util.Scanner;

public class Script {
    public static void main(String[] args) {
    
        //relevant instances
        Scanner scan = new Scanner(System.in);
        Animation animations = new Animation();
        Menu menu = new Menu();
        Art art = new Art();
        Character character = new Character();

        //creates character & assigns base class
        Base playerOne = new Base();

        System.out.print(playerOne.attack);
        character.equipWeapon(playerOne, Rock);
        menu.showInventory(playerOne);

        //display dope Nietzsche quote
        System.out.println("\t\u201CWhy couldn\u2019t the world that concerns us\u2014be a fiction?\n" +
                "\t And if somebody asked,\n" +
                "\t\u2018but to a fiction there surely belongs an author?\n" +
                "\t\u2019\u2014couldn\u2019t one answer simply: why?\u201D (Nietzsche, Beyond Good & Evil).");

        animations.pause(2000);
        animations.lineUp(10);
        animations.consoleClear();
        System.out.println("");

        art.BeachGuy();
        //capture player name
        System.out.println("\n" + "Hey. You know me. What is your name, though?");
        playerOne.name = scan.nextLine();

        //let's breathe life
        //create new instance of animations
        animations.consoleClear();

        System.out.println("That's great.");
        
        animations.dotSuspense();
        animations.consoleClear();

        art.Mountains();
        System.out.println("What a beautiful place..." +
                "Unfortunately, your time cannot be spent admiring it.");

        animations.pause(2000);
        animations.lineUp(10);
        animations.consoleClear();
        animations.dotSuspense();

        System.out.println("Let's test your skill.");

        //initiate enemy
        Wretch wretch = new Wretch();

        //new instance of Combat
        Combat combat = new Combat();

        //display wretch
        art.Wretch();
        //boot up combat
        combat.startCombat(playerOne, wretch);


    }
}
