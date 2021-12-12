package lab2_StrategyDesignPattern;

import lab2_StrategyDesignPattern.Model.Currency;
import lab2_StrategyDesignPattern.Model.Product;

import java.util.List;

public interface Shopping {

    double calculatePrice(List<Product> products);
    Currency getCurrency();
}