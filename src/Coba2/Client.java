package Coba2;

public class Client {
        String clientName;
        Integer totalItemBought;

        Client(String name, Integer total){
            this.clientName = name;
            this.totalItemBought = total;
        }

        void display(){
            System.out.println("Client Name: " +clientName);
            System.out.println("Total Item Bought: " +totalItemBought);
        }

}
