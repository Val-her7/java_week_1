public class Trainer extends Team implements Work {
    //METHOD OVERRIDING = WHEN A SUBCLASS PROVIDES ITS OWN IMPLEMENTATION OF A METHOD THAT IS ALREADY DEFINED
    @Override
    void playInTeam(){
        System.out.println("is the FC Bayern trainer!");
    }

    @Override
    public void work(){
        System.out.println("Analyze and found tactics!");
    }
}