package lab2_StrategyDesignPattern;

public class dutyTaxUS implements dutyTax{

    @Override
    public double findDutyTax() {
        return 0.01;//1%
    }
}
