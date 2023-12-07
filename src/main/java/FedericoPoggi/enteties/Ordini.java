package FedericoPoggi.enteties;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ordini extends Utenti {
    public Ordini(String name,int tier){
        super(name,tier);
        Random rand=new Random();
        long orderId= rand.nextLong();
        String status="To specify";
        LocalDate data=LocalDate.now();
        LocalDate deliveryDate=LocalDate.of(2023,12,7);
        List<Prodotti> products=new ArrayList<>();
        String customer=getName();
    }


    @Override
    public String getName() {
        return super.getName();
    }

    /*METODI*/
    public static void adProduct(Prodotti e){

    }
}
