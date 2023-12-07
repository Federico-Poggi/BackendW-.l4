package FedericoPoggi.enteties;

import java.util.Random;

public class Prodotti {
    public Prodotti(String name, double price, String category){
        Random random=new Random();
        long idProduct=random.nextLong();
        double singlePrice=price;
        String categoria=category;
    }

}
