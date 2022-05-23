package Coba2;

public class Book extends Item {
    String author;
    Integer numberOfPages;
    String genre;

    Book(String clientName, Integer totalItemBought) {
        super(clientName, totalItemBought);
    }

    void display(){
        System.out.println("Author: " +author);
        System.out.println("Number of Pages:" +numberOfPages +"Halaman");
        System.out.println("Genre:" +genre);
    }
}
