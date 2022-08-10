package Behavioral.State;

import Behavioral.State.Car.Car;
import Behavioral.State.Car.StartEngine;
import Behavioral.State.Car.OpenCar;
import Behavioral.State.Car.State;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setState(new OpenCar());

        for (int i = 0; i < 5; i++) {
            car.getState().doSomething();
            car.changeState();
        }
    }
}
