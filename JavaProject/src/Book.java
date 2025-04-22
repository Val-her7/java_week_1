public class Book {
    String name;
    int year;
    int numberOfPages;

    Book(String name, int year, int numberOfPages){
        this.name = name;
        this.year = year;
        this.numberOfPages = numberOfPages;
    }

    void displayInfo(){
        System.out.println(this.name + " " + this.year + " (" + this.numberOfPages + " pages)");
    }
}