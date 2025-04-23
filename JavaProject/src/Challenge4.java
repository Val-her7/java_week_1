import java.util.Random;

public class Challenge4 {

    public static void divideByZero(){
        //Generates random array of non-primitives integers
        Random random = new Random();
        int lengthArray;
        lengthArray = random.nextInt(5, 16);
        Integer[] randomArray = new Integer[lengthArray];

        //Divide numbers in array
        for(int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(0,10);
            try{
                if(i == 0){
                    System.out.println(randomArray[i] + " divided by itself equals " + (randomArray[i]/ randomArray[i]));
                }
                else{
                    System.out.println(randomArray[i] + " divided by " + randomArray[i-1] + " equals " + (randomArray[i]/ randomArray[i-1]));
                }
            }
            catch(ArithmeticException e){
                System.out.println("You cannot divide by zero!");
            }
            catch(Exception e){
                System.out.println("Something went wrong...");
                e.printStackTrace();
            } 
        }
    }
}