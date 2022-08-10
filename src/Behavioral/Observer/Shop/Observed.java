package Behavioral.Observer.Shop;

public interface Observed {
    void notifyObservers();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
