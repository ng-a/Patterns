package Behavioral.State.Car;

public class Car {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeState() {
        if (state instanceof OpenCar) {
            setState(new StartEngine());
        } else if (state instanceof  StartEngine) {
            setState(new MoveCar());
        } else if (state instanceof  MoveCar) {
            setState(new StopEngine());
        } else if (state instanceof  StopEngine) {
            setState(new CloseCar());
        } else if (state instanceof  CloseCar) {
            setState(new OpenCar());
        }
    }

}
