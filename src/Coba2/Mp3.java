package Coba2;

public class Mp3 extends Item {
    String artist;
    Integer duration;

    Mp3(String clientName, Integer totalItemBought) {
        super(clientName, totalItemBought);
    }


    void display(){
        System.out.println("Artist: " +artist);
        System.out.println("Duration: " +duration);
    }
}
