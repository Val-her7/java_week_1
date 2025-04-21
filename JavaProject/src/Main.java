import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Player player1 = new Player("Musiala", 22, "Midfielder", "German");
        Player player2 = new Player("Ito", 24, "Defender", "Japanese");
        Player player3 = new Player("Pavlovic", 20, "Midfielder", "German", false);
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

        scanner.close();
    }
}
