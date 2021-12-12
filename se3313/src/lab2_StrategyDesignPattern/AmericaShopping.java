package lab2_StrategyDesignPattern;

import lab2_StrategyDesignPattern.Model.Currency;
import lab2_StrategyDesignPattern.Model.Product;
import lab2_StrategyDesignPattern.Model.Size;

import java.util.List;

public class AmericaShopping implements Shopping{
    dutyTax dutyTax;
    baseDelivery baseDelivery;
    public AmericaShopping(){
        dutyTax = new dutyTaxUS();
        baseDelivery = new baseDeliveryUS();
    }

    @Override
    public double calculatePrice(List<Product> products) {
        double totalListSum = 0;
        double sum = 0;
        double additionalCharge = 0; //10 dollars extra shipping
        double shippingFee =0; //5 dollars
        double baseDeliveryFee=baseDelivery.findBaseDelivery();//15 dollars
        double customDuty=dutyTax.findDutyTax();
        double additionalTax=0.0075;//75% additional america tax

        for(int i = 0; i < products.size() ; i++){
            Size s = products.get(i).getSize();
            double productPrice  = products.get(i).getPrice();
            sum += productPrice+(productPrice*customDuty);
            if(s == Size.XL)
            {
                additionalCharge += 10.0;
            }
            else{
                shippingFee+=5;
            }
            totalListSum=totalListSum+(totalListSum*additionalTax);
            sum += shippingFee;
            sum += additionalCharge;
            totalListSum = sum + baseDeliveryFee;
        }
        return totalListSum;
    }

    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }
}

//duty tax DONE, delivery fee DONE, xl addition ? .
