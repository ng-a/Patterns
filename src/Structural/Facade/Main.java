package Structural.Facade;

public class Main {
    public static void main(String[] args) {
        Facade car = new Facade();

        car.moveForward();
        car.moveBackward();
    }
}