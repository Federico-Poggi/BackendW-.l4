package FedericoPoggi.enteties;

import java.util.Random;

public class Utenti {
    /*ATTRIBUTI*/
    private String name;
    int tier;
    /*CONSTRUCTOR*/
    public Utenti(String name, int tier){
        Random random=new Random();
        long customerId=random.nextLong();
        this.name=name;
        this.tier=tier;
    }

    /*GETTERS*/
    public String getName() {
        return name;
    }
    /*METODI*/
}
