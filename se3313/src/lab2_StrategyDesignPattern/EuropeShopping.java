package lab2_StrategyDesignPattern;

import lab2_StrategyDesignPattern.Model.Currency;
import lab2_StrategyDesignPattern.Model.Product;
import lab2_StrategyDesignPattern.Model.Size;

import java.util.List;

public class EuropeShopping implements Shopping{
    dutyTax dutyTax;
    baseDelivery baseDelivery;
    public EuropeShopping(){
        dutyTax = new dutyTaxEUR();
        baseDelivery = new baseDeliveryEUR();
    }

    @Override
    public double calculatePrice(List<Product> products) {
        double totalListSum = 0;
        double sum = 0;
        double additionalCharge = 10; //10 dollars extra shipping
        double baseDeliveryFee=baseDelivery.findBaseDelivery();//11 euro
        double customDuty=dutyTax.findDutyTax();

        for(int i = 0; i < products.size() ; i++){
            Size s = products.get(i).getSize();
            double productPrice  = products.get(i).getPrice();
            sum += productPrice+(productPrice*customDuty);
            if(s == Size.XL)
            {
                sum+=additionalCharge;
            }
            totalListSum = sum + baseDeliveryFee;
        }
        return totalListSum;

    }

    @Override
    public Currency getCurrency() {
        return Currency.EUR;
    }
}
