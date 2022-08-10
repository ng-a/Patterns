package Behavioral.Strategy;

import Behavioral.Strategy.Car.Car;
import Behavioral.Strategy.Car.Lock;
import Behavioral.Strategy.Car.Open;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setState(new Open());
        car.executeState();

        car.setState(new Lock());
        car.executeState();
    }
}
