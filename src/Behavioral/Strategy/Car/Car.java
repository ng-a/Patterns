package Behavioral.Strategy.Car;

public class Car {
    private State state;

    public void executeState() {
        this.state.doSomething();
    }

    public void setState(State state) {
        this.state = state;
    }

}
