public class Engine {
    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("The " + this.type + "  engine is starting");
    }
}
