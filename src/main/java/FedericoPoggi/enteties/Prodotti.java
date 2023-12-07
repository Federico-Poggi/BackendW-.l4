package FedericoPoggi.enteties;

import java.util.Random;

public class Prodotti {
    private long idProduct;
    private double singlePrice;
    private String categoria;
    public Prodotti(String name, double price, String category){
        Random random=new Random();
        this.idProduct=random.nextLong();
        this.singlePrice=price;
        this.categoria=category;
    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public double getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(double singlePrice) {
        this.singlePrice = singlePrice;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
