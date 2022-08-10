package Behavioral.State.Car;

public class MoveCar implements State {
    @Override
    public void doSomething() {
        System.out.println("Move car");
    }
}
