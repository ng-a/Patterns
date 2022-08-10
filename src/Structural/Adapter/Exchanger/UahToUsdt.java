package Structural.Adapter.Exchanger;

public class UahToUsdt extends NewCurrency {
    private float price = 40.2f;

    @Override
    public void changeCurrency(float amount) {
        super.amount += amount / price;
    }
}
