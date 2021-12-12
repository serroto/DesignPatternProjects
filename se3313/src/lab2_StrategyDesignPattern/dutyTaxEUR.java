package lab2_StrategyDesignPattern;

public class dutyTaxEUR implements dutyTax{

    @Override
    public double findDutyTax() {
        return 0.015;//1.5%
    }
}
