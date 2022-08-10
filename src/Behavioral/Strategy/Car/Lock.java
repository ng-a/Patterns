package Behavioral.Strategy.Car;

public class Lock implements State {
    @Override
    public void doSomething() {
        System.out.println("Car closed");
    }
}
