package Structural.Adapter.Exchanger;

import Structural.Adapter.Interface.Currency;

public class NewCurrency implements Currency{
    protected float amount;

    @Override
    public float getAmount() {
        return this.amount;
    }

    @Override
    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public void changeCurrency(float amount) {}
}
