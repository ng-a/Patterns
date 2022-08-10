package Behavioral.Strategy.Car;

public class Open implements State {
    @Override
    public void doSomething() {
        System.out.println("Car open");
    }
}
