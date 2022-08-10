package Behavioral.State.Car;

public class OpenCar implements State {
    @Override
    public void doSomething() {
        System.out.println("Car open");
    }
}
