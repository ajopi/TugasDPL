package Coba1;

public class Dvd extends Item{
    String certificate;
    Integer duration;
    String actors;

    void display(){
        System.out.println("Certificate: " +certificate);
        System.out.println("Duration: " +duration);
        System.out.println("Actors: " +actors);

    }
}
