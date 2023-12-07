package FedericoPoggi;

import FedericoPoggi.enteties.Prodotti;
import FedericoPoggi.enteties.Utenti;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Utenti giovanni=new Utenti("Giovanni",1);
        Utenti antonio=new Utenti("Antonio",2);
        Utenti paolo =new Utenti("paolo",2);
        Utenti paola=new Utenti("paola",2);
        Utenti donni=new Utenti("donni",2);

        //adesso bisogna i prodotti
        Prodotti gameboy =new Prodotti("GameBoy",150.99,"Boys");
        Prodotti guerraepace =new Prodotti("Guerra e pace",150,"Books");
        Prodotti ciuccio =new Prodotti("Ciuccio",2.90,"Baby");
        Prodotti pcFisso =new Prodotti("PC Fisso",1000,"Boys");
        Prodotti piccoliBrividi =new Prodotti("Piccoli Brividi",20.50,"Books");
        Prodotti pista =new Prodotti("Pista",50,"Baby");
        Prodotti coltello =new Prodotti("Coltello da lancio",50.85,"Boys");

        List<Prodotti> listaProdotti=new ArrayList<>();
        listaProdotti.add(gameboy);
        listaProdotti.add(guerraepace);
        listaProdotti.add(ciuccio);
        listaProdotti.add(pcFisso);
        listaProdotti.add(piccoliBrividi);
        listaProdotti.add(pista);
        listaProdotti.add(coltello);

        List<Prodotti> listaProdottimaggcento=listaProdotti.stream().filter(prodotti -> prodotti.getCategoria().equals("Books")&&prodotti.getSinglePrice()>100).toList();
        System.out.println(listaProdottimaggcento.toString());

    }


}
