package Coba2;

public class Dvd extends Item{
    String certificate;
    Integer duration;
    String actors;

    Dvd(String clientName, Integer totalItemBought) {
        super(clientName, totalItemBought);
    }


    void display(){
        System.out.println("Certificate: " +certificate);
        System.out.println("Duration: " +duration);
        System.out.println("Actors: " +actors);

    }
}
