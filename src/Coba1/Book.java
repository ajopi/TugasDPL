package Coba1;

public class Book extends Item{
    String author;
    Integer numberOfPages;
    String genre;

    void display(){
        System.out.println("Author: " +author);
        System.out.println("Number of Pages:" +numberOfPages +"Halaman");
        System.out.println("Genre:" +genre);
    }
}
