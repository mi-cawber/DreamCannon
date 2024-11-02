
//create Items class
public class Item {
    String name;
    String description;
    int attack;

    
    //create constructor
    public Item(String name, int value, int attack) {
        this.name = name;
        this.description = null;
        this.attack = 0;
    }

}

//the first weapon
class Rock extends Item {

    //constructor
    public Rock() {
        super("Rock", 0, 5);
        this.description = "Just a rock. can probably hurt something with it.";
        //sets attack value for rock
    }
}