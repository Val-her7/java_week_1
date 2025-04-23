import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Challenge7 {
    public static void readCSVFile(){
        try(BufferedReader reader = new BufferedReader(new FileReader("src\\students.csv"))){
            System.out.println("That file exists!");
            String line;
            while((line = reader.readLine())!= null){
                String[] studentInfos = line.split(",");

                String lastName = studentInfos[0];
                String firstName = studentInfos[1];
                int age = Integer.parseInt(studentInfos[2]);
                char classe = studentInfos[3].charAt(0);
                double notation = Double.parseDouble(studentInfos[4]);

                Student student = new Student(lastName, firstName, age, classe, notation);
                System.out.println(student.getLastname() + " " + student.getFirstname() + " " + student.getAge() + " " + student.getClasse() + " " + student.getNotation());
                
            }
        }
        catch(FileNotFoundException error){
            System.out.println("Sorry, we cannot locate file location");
        }
        catch(IOException error){
            System.out.println("Something went wrong");
            error.printStackTrace();
        }
    }
}