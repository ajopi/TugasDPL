package Coba1;

class Item extends Client{
    String nameOfProduct;
    String description;
    Integer price;


    void displayItem(){
        System.out.println("Name: "+nameOfProduct);
        System.out.println("Description: " +description);
        System.out.println("Rp."+price);
    }
}
