//INHERITANCE = ONE CLASS INHERITS ATTRIBUTES AND METHODS FROM ANOTHER CLASS / CHILD(SUBCLASS) <- PARENT(SUPERCLASS) <- GRANDPARENT
public class Player extends Team implements Work {

    String name;
    int age;
    String position;
    String nationality;
    boolean playTheMatch;

    //STATIC = VARIABLE OR METHOD NOT BELONGS TO SPECIFIC OBJECT BUT TO THE CLASS, OFTEN USED FOR SHARED RESSOURCES OR UTILITY METHODS
    static int numberOfPlayers = 0;

    //CONSTRUCTOR
    Player(String name, int age, String position, String nationality){
        this.name = name;
        this.age = age;
        this.position = position;
        this.nationality = nationality;
        this.playTheMatch = true;
        numberOfPlayers ++;
    }

    //OVERLOADED CONSTRUCTOR = ALLOW A CLASS TO HAVE MULTIPLE CONSTRUCTORS, ENABLES OBJECTS TO BE INITIALIZED IN VARIOUS WAYS
    Player(String name, int age, String position, String nationality, boolean playTheMatch){
        this.name = name;
        this.age = age;
        this.position = position;
        this.nationality = nationality;
        this.playTheMatch = playTheMatch;
        numberOfPlayers ++;
    }

    Player(){
        this.name = "Guest";
        this.age = 0;
        this.position = "Unknown";
        this.nationality = "Not provided";
        this.playTheMatch = false;
    }

    void score(){
        System.out.println(this.name + " has scored a goal!!");
    }

    void bench(){
        this.playTheMatch = false;
        System.out.println(this.name + " is on the bench...");
    }

    void position(){
        System.out.println(this.name + " plays as a " + this.position);
    }

    static void showPlayers(){
        System.out.println("There are " + numberOfPlayers + " players in the team.");
    }

    /*TOSTRING METHOD = METHOD INHERITED FROM THE OBJECT CLASS
                        USED TO RETURN A STRING REPRESENTATION OF AN OBJECT
                        BY DEFAULT, IT RETURNS A HASH CODE AS A UNIQUE IDENTIFIER
                        CAN BE OVERRIDEN TO PROVIDE MEANINGFUL DETAILS                   
    */
    @Override
    public String toString(){
        return this.name + " " + this.position;
    }

    @Override
    public void work(){
        System.out.println("Train vision, technique and endurance!");
    }
}