//scanner
import java.util.Scanner;

public class Combat {

    //relevant instances
    Animation animation = new Animation();
    Audio audio = new Audio();

    public void startCombat(Character player, Character enemy) {

        //announces enemy approach
        System.out.println(enemy.getClass().getSimpleName() + " has appeared!");

        //runs while both players have health
        while (player.health > 0 && enemy.health > 0) {

            // Player attacks the enemy first by calling the attack method
            playerAttack(player, enemy);

            // If the enemy is defeated, we print a message and exit the loop
            if (enemy.health <= 0) {
                System.out.println("Enemy has been defeated!");
                break;
            }

            //enemy attacks the player
            enemyAttack(enemy, player);

            // If the player is defeated, we print a message and exit the loop
            if (player.health <= 0) {
                System.out.println("Player has been defeated!");
                break;
            }
        }
    }

    public void playerAttack(Character player, Character enemy) {
        Scanner scanner = new Scanner(System.in);

        boolean validPlayerAttack = false;

        //should repeat until player inputs a
        while (!validPlayerAttack) {
            System.out.println("What would you like to do?");
            System.out.println("Attack (a)");
            String response = scanner.nextLine();

            if (response.equals("a")) {

                audio.playSound("/Users/joshua/Desktop/DreamCannon/sounds/rockHit.wav");
                //calculate damage
                int damage = player.attack - enemy.defense;
                enemy.health -= damage;

                //report damage
                System.out.println(enemy.name + " was hit for " + damage + " damage.");

                //pause for read
                animation.pause(500);

                //move out of while loop
                validPlayerAttack = true;

            } else {
                //for invalid input
                System.out.println("That won't get you very far.");
            }
        }
    }

    public void enemyAttack(Character enemy, Character player) {

        //make damage available to all conditions
        int damage = 0;

        //normal stuff
        if (player.defense < enemy.attack){

            damage = enemy.attack - player.defense;
            player.health -= damage;

        } else {
            //terrible solution
            damage = 0;
            player.health -= damage;
        }

        //report damage
        System.out.println(player.name + " was hit for " + damage + " damage.");

        animation.pause(500);
    }
}