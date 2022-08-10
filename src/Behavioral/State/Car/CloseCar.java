package Behavioral.State.Car;

public class CloseCar implements State {
    @Override
    public void doSomething() {
        System.out.println("Car closed");
    }
}
