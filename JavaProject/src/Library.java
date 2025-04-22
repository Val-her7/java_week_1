public class Library {
    String name;
    String address;
    Book[] books;

    Library(String name, String address, Book[] books){
        this.name = name;
        this.address = address;
        this.books = books;
    }

    void displayInfo(){
        System.out.println(this.name + " " + this.address);
    }
}