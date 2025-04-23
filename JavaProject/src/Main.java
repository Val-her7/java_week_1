import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
        Player player1 = new Player("Musiala", 22, "Midfielder", "German");
        Player player2 = new Player("Ito", 24, "Defender", "Japanese");
        Player player3 = new Player("Pavlovic", 20, "Midfielder", "German", false, 400000);
        Player player4 = new Player();
        Trainer trainer = new Trainer();

        System.out.println(player1.name + " is " + player1.age + " years old and his a " + player1.nationality + " " + player1.position);

        System.out.println("Play the match: " + player1.playTheMatch);
        player1.score();

        player2.bench();
        System.out.println("Play the match: " + player2.playTheMatch);

        System.out.println(player3.playTheMatch);
        
        System.out.println(player4.name);

        //ARRAY OF OBJECTS
        Player[] players = new Player[4];
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
        players[3] = player4;
        
        for(Player player: players){
            player.position();
            player.playInTeam();
        }

        System.out.println(Player.numberOfPlayers);
        Player.showPlayers();

        trainer.playInTeam();
        player1.work();
        trainer.work();

        /*POLYMORPHISM => "POLY" = "MANY"
                          "MORPH" = "SHAPE"
                          OBJECTS CAN IDENTIDY AS OTHER OBJECTS
                          OBJECTS CAN BE TREATED AS OBJECTS OF A COMMON SUPERCLASS
        */
        Work[] works = {player1, trainer};
        for(Work work : works){
            work.work();
        }
        Team[] teams = {player1, trainer};
        for(Team team : teams){
            team.playInTeam();
        }

        //RUNTIME POLYMORPHISM = WHEN THE METHOD THAT GETS EXECUTED IS DECIDED AT RUNTIME BASED ON THE ACTUAL TYPE OF THE OBJECT
        Scanner scanner = new Scanner(System.in);
        Team person;

        System.out.print("Are you a player (1) or a trainer(2) ? ");
        int choice = scanner.nextInt();

        if(choice == 1){
            person = new Player();
            person.playInTeam();;
        } 
        else if(choice == 2){
            person = new Trainer();
            person.playInTeam();
        }

        //GETTER / SETTER => THEY HELP PROTECT OBJECT DATA AND ADD RULES FOR ACCESSING OR MODIFYING THEM
        System.out.println(player3.getSalary());
        player3.setSalary(650000);
        System.out.println(player3.getSalary());

        /*AGGREGATION = REPRESENTS A "HAS-A" RELATIONSHIP BETWEEN OBJECTS
                        ONE OBJECT CONTAINS ANOTHER OBJECT AS PART OF HIS STRUCTURE
                        BUT THE CONTAINED OBJECT CAN EXIST INDEPENDENTLY
        */
        Book book1 = new Book("Hunger Games", 2010, 421);
        Book book2 = new Book("Hunger Games 2", 2013, 395);
        Book[] books = {book1, book2};
        Library library = new Library("Library Baudour", "7331 Baudour", books);
        library.displayInfo();
        for(Book book : books){
            book.displayInfo();
        }

        /*COMPOSITION = REPRESENTS A "PART-OF" RELATIONSHIP BETWEEN OBJECTS
                        ALLOWS COMPLEX OBJECTS TO BE CONSTRUCTED FROM SMALLER OBJECTS
        */
        Car myCar = new Car("Mercedes", "grey", "V8");

        System.out.println(myCar.engine); //REFERENCE TYPE
        myCar.start();

        /*WRAPPER CLASS = ALLOW PRIMITIVE VALUES TO BE USED AS OBJECTS "WRAP THEM IN AN OBJECT"
                          ALLOW USE OF COLLECTION FRAMEWORK AND STATIC UTILITY METHODS
        */
        //AUTOBOXING = PRIMITIVE -> WRAPPER
        Integer e = 5;
        Double f = 5.99;
        Character g = 'c';
        Boolean h = true;

        //UNBOXING = WRAPPER -> PRIMITIVE
        int i = e;
        double j = f;
        char k = g;
        boolean l = h;

        //STATIC METHODS EXAMPLES
        String m = Integer.toString(i);
        String n = Double.toString(j);
        String o = Character.toString(k);
        String p = Boolean.toString(l);

        String q = m + n + o + p;
        System.out.println(q);

        int a = Integer.parseInt("5");
        double b = Double.parseDouble("5.99");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        System.out.println(Character.isLetter(c));
        System.out.println(Character.isUpperCase(c));

        //ARRAYLIST = A RESIZEABLE ARRAY THAT STORES OBJECTS(AUTOBOXING), ARRAYS ARE FIXED IN SIZE BUT ARRAYLISTS CAN CHANGES AND HAVE DIFFERENT DATA TYPES
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(5);
        ids.set(1, 4);
        System.out.println(ids.get(0));
        Collections.sort(ids);
        System.out.println(ids);
        System.out.println(ids.size());

        ArrayList<Object> mix = new ArrayList<>();
        mix.add("Valentin");
        mix.add(24);
        mix.add(true);
        mix.set(2, false);
        System.out.println(mix);
        for(Object object : mix){
            System.out.println(object);
        }

        /*EXCEPTIONS = AN EVENT THAT INTERRUPTS THE NORMAL FLOW OF THE PROGRAM
                       (DIVIDING BY ZERO, FILE NOT FOUND, MISMATCH INPUT TYPE)
                       SURROUND ANY DANGEROUS CODE WITH A TRY{} BLOCK
                       TRY{} CATCH{} FINALLY{}
        */
        try{
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int result = 10 / num;
            System.out.println(result);
        }
        catch(ArithmeticException err){
            System.out.println("You cannot divide by zero!");
        }
        catch(InputMismatchException err){
            System.out.println("Please enter a number");
        }
        catch(Exception err) {
            //SAFETY NET = WHEN SOMETHING YOU NOT ANTICIPATED
            System.out.println("Something went wrong");
        }
        finally{
            //EXECUTE EVEN IF EXCEPTION OCCURES- CLOSE SCANNER, CLOSE FILE FOR EXAMPLE
            System.out.println("This is always executed");
        }

        scanner.close();

        /*WRITE FILES
        FileWriter = GOOD FOR SMALL OR MEDIUM SIZED TEXT FILES
        BufferedWriter = BETTER PERFORMANCE FOR LARGE AMOUNTS OF TEXT
        PrintWriter = BEST FOR STRUCTURED DATA LIKE REPORTS OR LOGS
        FileOutputStream = BEST FOR BINARY FILES (AUDIO, IMAGES)
        */
        //TEXT FILE
        String filePath = "C:\\Users\\valou\\OneDrive\\Bureau\\test.txt";
        String content = "Hello Wolrd!\nIm Valentin";
        try{
            FileWriter writer = new FileWriter(filePath);
            writer.write(content);
            System.out.println("File has been written!");
            writer.close();
        }
        catch(FileNotFoundException error){
            System.out.println("Sorry, we cannot locate file location");
        }
        catch(IOException error){
            System.out.println("Somethong went wrong");
            error.printStackTrace();
        }

        //CSV FILE
        try(FileWriter writer = new FileWriter("C:\\Users\\valou\\OneDrive\\Bureau\\test.csv")){
            writer.write("name, age, nationality\n");
            writer.write("Valentin, 24, belgian\n");
        }
        catch(FileNotFoundException error){
            System.out.println("Sorry, we cannot locate file location");
        }
        catch(IOException error){
            System.out.println("Somethong went wrong");
            error.printStackTrace();
        }

        /*READ FILES
         BufferedReader + FileReader = BEST FOR READING TEXT FILES LINE BY LINE
         FileInputStream = BEST FOR BINARY FILES
         RandomAccessFile = BEST FOR READ / WRITE SPECIFIC PORTIONS OF LARGE FILE
        */
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\valou\\OneDrive\\Bureau\\test.txt"))){
            System.out.println("That file exists!");
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException error){
            System.out.println("Sorry, we cannot locate file location");
        }
        catch(IOException error){
            System.out.println("Somethong went wrong");
            error.printStackTrace();
        }

        //DATES AND TIMES
        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.of(2024, 1, 9);
        System.out.println(date);
        System.out.println(date2);
        System.out.println(date.isBefore(date2));
        System.out.println(date.isAfter(date2));
        System.out.println(date.isEqual(date2));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        //UTC TIMESTAMP
        Instant instant = Instant.now();
        System.out.println(instant);

        //CUSTOM FORMAT
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = datetime.format(formatter);
        System.out.println(newDateTime);

        /*ANONYMOUS CLASS = A CLASS THAT DOESN'T HAVE A NAME. CANNOT BE REUSED
                            ADD CUSTOM BEHAVIOR WITHOUT HAVING TO CREATE A NEW CLASS
                            OFTEN USED FOR ONE TIME USES (TIMERTASK, RUNNABLE, CALLBACKS)
        */
        Trainer trainer2 = new Trainer(){
            @Override
            public void work(){
                System.out.println("Physical Trainer");
            }
        };
        trainer2.work();
        trainer.work();

        /*TIMER = CLASS THAT SCHEDULES TASKS AT SPECIFIC TIMES OR PERIODICALLY
                  USEFUL FOR: SENDING NOTIFICATIONS, SCHEDULED UPDATES, REPETITIVE ACTIONS

        TIMERTASK = REPRESENTS THE TASK THAT WILL BE EXECUTED BY THE TIMER
                    YOU WILL EXTEND THE TIMERTASK CLASS TO DEFINE YOUR CLASS (OVERRIDE RUN())
        */
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 5;
            @Override
            public void run(){
                System.out.println("Java is cool!");
                count--;
                if(count <= 0){
                    System.out.println("TASK COMPLETED!");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0, 1000);
    }
}