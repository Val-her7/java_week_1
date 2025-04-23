public class Student {

    private String lastName;
    private String firstName;
    private int age;
    private char classe;
    private double notation;

    Student(String lastName, String firstName, int age, char classe, double notation){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.classe = classe;
        this.notation = notation;
    }

    String getLastname(){
        return this.lastName;
    }

    String getFirstname(){
        return this.firstName;
    }

    int getAge(){
        return this.age;
    }

    char getClasse(){
        return this.classe;
    }

    double getNotation(){
        return this.notation;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setAge(int age){
        this.age = age;
    }

    void setClasse(char classe){
        this.classe = classe;
    }

    void setNotation(double notation){
        this.notation = notation;
    }
}