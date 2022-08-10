package Structural.Adapter;

import Structural.Adapter.Interface.Currency;

import Structural.Adapter.Exchanger.UahToUsdt;
import Structural.Adapter.Exchanger.NewCurrency;

public class Main {
    public static void main(String[] args) {
        Currency UAH = new NewCurrency();
        UAH.setAmount(5000);
        System.out.println("UAH: " + UAH.getAmount());

        Currency USDT = new UahToUsdt();
        USDT.changeCurrency(UAH.getAmount());
        System.out.println("USDT: " + USDT.getAmount());
    }
}