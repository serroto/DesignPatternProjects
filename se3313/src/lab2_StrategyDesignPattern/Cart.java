package lab2_StrategyDesignPattern;
import lab2_StrategyDesignPattern.Model.Product;

import java.util.ArrayList;

public class Cart {
    private final Shopping s;
    ArrayList<Product> products = new ArrayList<>();

    public Cart(Shopping s) {
        this.s=s;
    }
    public void addProduct(Product p){
        products.add(p);
    }
    public double getTotalPrice(){
        return s.calculatePrice(products);
    }
}
