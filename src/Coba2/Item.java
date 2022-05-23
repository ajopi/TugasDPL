package Coba2;

public class Item extends Client{
    String nameOfProduct;
    String description;
    Integer price;

    Item(String clientName, Integer totalItemBought){
        super(clientName, totalItemBought);
    }

    void displayItem(){
        System.out.println("Client Name: " +clientName);
        System.out.println("Total Item Bought: "+totalItemBought);
        System.out.println("Name: "+nameOfProduct);
        System.out.println("Description: " +description);
        System.out.println("Rp."+price);
    }
}
