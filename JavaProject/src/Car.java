public class Car {
    String model;
    String color;
    Engine engine;

    Car(String model, String color, String engineType){
        this.model = model;
        this.color = color;
        this.engine = new Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.color + " " + this.model + " is starting!");
    }
}
