import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) throws Exception {
        
        //SCANNER
        Scanner scanner = new Scanner(System.in);

        // char currency = '$';
        // int quantity;
        // String item;
        // double price;

        // System.out.print("What item would you like to buy? ");
        // item = scanner.nextLine();
        // System.out.println(item);

        // System.out.print("How many? ");
        // quantity = scanner.nextInt();
        // System.out.println(quantity);

        // System.out.print("What is the price? ");
        // price = scanner.nextDouble();
        // System.out.println(price);

        // System.out.println("You bought " + quantity + " "+ item + " for the price of " + currency + price*2);

        // scanner.close();

        //RANDOM
        Random random = new Random();

        // int number;
        // number = random.nextInt(1, 6);
        // System.out.println(number);

        // double prob;
        // prob = random.nextDouble();
        // System.out.println(prob);

        //MATH
        // double result;
        // double round;
        // result = Math.PI;
        // result = Math.ceil(3.37);
        // result = Math.floor(3.99);
        // result = Math.round(random.nextDouble());
        // result = Math.max(2, 54);
        // round = random.nextDouble();
        // System.out.println(result);
        // System.out.println(round);
        // System.out.printf("%.2f", round);

        //PRINTF
        // String name = "Valentin";
        // int age = 24;
        // char firstNameLetter = 'V';
        // boolean isProBabyfoot = true;
        // double height = 180.15;

        // System.out.printf("Hello %s\n", name);
        // System.out.printf("Your are %d years old\n", age);
        // System.out.printf("Your first letter is %c\n", firstNameLetter);
        // System.out.printf("You are a pro babyfooter: %b\n", isProBabyfoot);
        // System.out.printf("You are %.2f cm height\n", height);

        // int number1 = 4;
        // int number2 = -4;
        // System.out.printf("% d\n", number1);
        // System.out.printf("% d\n", number2);

        // int id1 = 1;
        // int id23 = 23;
        // int id344 = 344;
        // int id5544 = 5544;
        // System.out.printf("%4d\n", id1);
        // System.out.printf("%4d\n", id23);
        // System.out.printf("%4d\n", id344);
        // System.out.printf("%4d\n", id5544);
        // System.out.printf("%04d\n", id1);
        // System.out.printf("%04d\n", id23);
        // System.out.printf("%04d\n", id344);
        // System.out.printf("%04d\n", id5544);

        // String a;
        // System.out.print("enter: ");
        // a = scanner.nextLine();
        // String [] arr = a.split(" ");
        // System.out.println(arr[0]);

        //STRING METHODS
        // String surname = "    Herman Valentin    ";
        // System.out.println(surname.charAt(0));
        // System.out.println(surname.indexOf("a"));
        // System.out.println(surname.lastIndexOf("e"));
        // System.out.println(surname.toUpperCase());
        // System.out.println(surname.toLowerCase());
        // System.out.println(surname.trim());
        // System.out.println(surname.replace("a", "u").trim().toUpperCase());
        // System.out.println(surname.isEmpty());
        // System.out.println(surname.contains("-"));

        // if(surname.trim().equalsIgnoreCase("herman valentin")){
        //     System.out.println("Hello " + surname.trim());
        // } else {
        //     System.out.println("There is a problem with your surname");
        // }

        //SUBSTRING
        // String email = "valentin.herman@gmail.com";
        // String userName = email.substring(0, email.indexOf("@"));
        // String domain = email.substring(email.indexOf("@") + 1);
        // System.out.printf("Username: %s and domain: %s", userName, domain);

        //TERNARY OPEAROR
        // int points = 45;
        // String passOrFail = (points >= 50) ? "PASS" : "FAIL";
        // System.out.println(passOrFail);

        // int n = 4;
        // String isEvenOrOdd = (n % 2 == 0) ? "Even" : "Odd";
        // System.out.println(isEvenOrOdd);

        // ENHANCED SWITCH
        // String day;
        // System.out.print("What is the day? ");
        // day = scanner.next().toLowerCase();
        // switch (day) {
        //     case "monday", "tuesday", "wednesday","thursday", "friday" -> System.out.println("Weekday");
        //     case "saturday", "sunday" -> System.out.println("Weekend");
        //     default -> System.out.println("Not a valid day");
        // }

        // EXERCICE CALCULATOR MACHINE
        // double num1;
        // double num2;
        // char operator;
        // double res = 0;
        // boolean isValidOperation = true;

        // System.out.print("First number: ");
        // num1 = scanner.nextDouble();

        // System.out.print("What is the operation?(+,-,/,*,%,^) ");
        // operator = scanner.next().charAt(0);

        // System.out.println("Second number: ");
        // num2 = scanner.nextDouble();

        // switch (operator) {
        //     case '+' -> res = num1 + num2;
        //     case '-' -> res = num1 - num2;
        //     case '/' -> {
        //         if(num2 == 0){
        //             System.out.println("Cannot divide by zero");
        //             isValidOperation = false;
        //         }else{
        //             res = num1 / num2;
        //         }
        //     }
        //     case '*' -> res = num1 * num2;
        //     case '%' -> res = num1 % num2;
        //     case '^' -> res = Math.pow(num1, num2);
        //     default -> {
        //         System.out.println("Not a correct operator!");
        //         isValidOperation = false;}
        // }
        // if(isValidOperation){
        //     System.out.printf("The result of %.2f %c %.2f equals to %.2f", num1, operator, num2, res);
        // } else{
        //     System.out.println("Operation cannot be performed...");
        // }

        //WHILE LOOPS
        // int positionFootball;
        // System.out.print("What's your position on the field?");
        // positionFootball = scanner.nextInt();

        // while(positionFootball != 7){
        //     System.out.print("What's your position on the field?");
        //     positionFootball = scanner.nextInt();
        // }
        // System.out.println("That's the best position ever!");

        // do {
        //     System.out.print("What's your position on the field?");
        //     positionFootball = scanner.nextInt();
        // } while (positionFootball != 7);

        //FOR LOOPS
        // for(int i=10; i > 0; i--){
        //     if(i == 5){
        //         continue;
        //     }
        //     if(i == 3){
        //         break;
        //     }
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }

        //NESTED LOOPS
        // int rows;
        // int columns;
        // char symbol;

        // System.out.print("How many rows? ");
        // rows = scanner.nextInt();

        // System.out.print("How many columns? ");
        // columns = scanner.nextInt();

        // System.out.print("What is the symbol? ");
        // symbol = scanner.next().charAt(0);

        // for(int i = 0; i < rows; i++){
        //     for(int j = 0; j < columns; j++){
        //         System.out.print(symbol);
        //     }
        //     System.out.println();
        // }

        //METHODS
        // String name = "Valentin";
        // happyBirthday(name);

        // System.out.println(square(7));

        //OVERLOADED METHODS
        //METHODS WITH SAME NAME BUT DIFFERENT PARAMETERS / SIGNATURE= NAME + PARAMETERS
        // System.out.println(add(1,2,3));
        // System.out.println(add(1,2,3,4));

        //ARRAYS
        // String[] fruits = {"apple", "banana", "orange", "coconut"};
        // Arrays.sort(fruits);
        // for(String fruit : fruits){
        //     System.out.println(fruit);
        // }
        // String[] players = new String[3];
        // System.out.println(players.length);
        // players[0] = "Musiala";
        // players[1] = "Muller";
        // players[2] = "Kane";
        // for(String player: players){
        //     System.out.println(player);
        // }

        //INPUT USER INTO ARRAY
        // int numberOfCards;
        // String[] cards;

        // System.out.print("Number of cards: ");
        // numberOfCards = scanner.nextInt();
        // scanner.nextLine();

        // cards = new String[numberOfCards];
        // for(int i = 0; i < numberOfCards; i++){
        //     System.out.print("Enter a card name: ");
        //     cards[i] = scanner.nextLine();
        // }
        // for(String card : cards){
        //     System.out.println(card);
        // }

        // String a =new String("hello");
        // String b =new String ("hello");
        // if(a.equals(b)){System.out.println("ok");}
        // System.out.println(addition(1,2,3,4,5));

        //2DARRAY
        // String[] defenders = {"Ito", "Davies", "Dier"};
        // String[] midfielders = {"Kimmich", "Goretzka", "Musiala"};
        // String[] forward = {"Kane", "Sane", "Gnabry"};
        // String[][] team = {defenders, midfielders, forward};
        // team[0][0] = "Upamecano";
        // for(String[] players : team){
        //     for(String position : players){
        //         System.out.print(position + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.printf("The best players is %s", team[1][0]);

        //EXERCICE SLOT MACHINE

        // int balance = 100;
        // String[] symbols = {"king", "queen", "valet", "soldier"};
        // String[] symbolsRandom = new String[3];
        // int bet;
        // String continuePlaying = "Y";

        // do {
        //     System.out.println("*******************");
        //     System.out.println("WELCOME TO THE SLOT GAME");
        //     System.out.println("*******************");
        //     System.out.printf("CURRENT BALANCE: $%d\n", balance );
        //     System.out.print("PLACE YOUR BET AMOUNT: ");
        //     bet = scanner.nextInt();
        //     if(bet > balance){
        //         System.out.println("*******************");
        //         System.out.println("YOU DONT HAVE ENOUGH IN YOUR BALANCE...");
        //         System.out.println("*******************");
        //         continue;
        //     }
        //     scanner.nextLine();
        //     System.out.println("SPINNING...");
        //     System.out.println("*******************");
        //     symbolsRandom[0] = symbols[random.nextInt(1,4)];
        //     symbolsRandom[1] = symbols[random.nextInt(1,4)];
        //     symbolsRandom[2] = symbols[random.nextInt(1,4)];
        //     for(String symbol : symbolsRandom){
        //         System.out.print(symbol + " ");
        //     }
        //     System.out.println();
        //     System.out.println("*******************");

        //     if(symbolsRandom[0].equals(symbolsRandom[1]) && symbolsRandom[1].equals(symbolsRandom[2])){
        //         System.out.println("YOU WON!");
        //         balance += bet * 3;
        //     } else {
        //         System.out.println("YOU LOSS...");
        //         balance -= bet;
        //     }

        //     System.out.print("Do you want to play again? (Y/N)");
        //     continuePlaying = scanner.nextLine().toUpperCase();
        // } while (continuePlaying.equals("Y"));
        // System.out.println("THANKS FOR PLAYING");
        
        scanner.close();
    }
    // static void happyBirthday(String name){
    //     System.out.println("Happy birthday:" + name);
    //     System.out.println("Congratulations!!!!");
    // }
    // static int square(int numToSquare){
    //     return numToSquare * numToSquare;
    // }
    // static int add(int a, int b, int c){
    //     return a + b + c;
    // }
    // static int add(int a, int b, int c, int d){
    //     return a + b + c + d;
    // }
    // static int glob = 5;//CLASS SCOPE
    // static void scop(){
    //     int glob = 4; //LOCAL SCOPE
    //     System.out.println(glob);
    // }
    //VARARGS
    //ALLOW A METHOD TO ACCEPT A VARYING # OF PARAMETERS
    //JAVA WILL PACK THE ARGUMENTS INTO AN ARRAY
    //...(ELLIPSIS)
    // static int addition(int... numbers){
    //     int sum = 0;
    //     for(int number : numbers){
    //         sum += number;
    //     }
    //     return sum;
    // }
}