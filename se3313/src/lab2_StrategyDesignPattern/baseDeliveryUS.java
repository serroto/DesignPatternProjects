package lab2_StrategyDesignPattern;

public class baseDeliveryUS implements baseDelivery{
    @Override
    public double findBaseDelivery() {
        return 15;
    }
}
