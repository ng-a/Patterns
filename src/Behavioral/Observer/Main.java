package Behavioral.Observer;

import Behavioral.Observer.Shop.Shop;
import Behavioral.Observer.Shop.Customer;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addObserver(new Customer("Maks"));
        shop.addObserver(new Customer("Bob"));

        shop.newItem("Milk");
        System.out.println("\n");


        shop.newItem("Bread");
        System.out.println("\n");
    }
}
