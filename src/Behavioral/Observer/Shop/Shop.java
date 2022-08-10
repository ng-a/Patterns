package Behavioral.Observer.Shop;

import java.util.ArrayList;
import java.util.HashSet;

public class Shop implements Observed{
    private HashSet<Observer> observers = new HashSet<>();
    private ArrayList<String> items = new ArrayList<String>();

    public void newItem(String item) {
        this.items.add(item);
        notifyObservers();
    }

    public void allItems() {
        for(String item : items){
            System.out.println(item + " ");
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.handleEvent(items.get(items.size() - 1));
        }
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }
}
