package Behavioral.Observer.Shop;

public class Customer implements Observer{
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String item) {
        System.out.println("New item " + item + " notifications for " + name);
    }
}
