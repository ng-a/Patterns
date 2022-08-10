package Creational.Prototype;

public class Main {
    public static void main(String[] args) {

        Car car = new CreateCar();
        car.setName("Mercedes");
        car.setColor("Black");

        Car car_clone = car.clone();
        System.out.println(
                "\nName: " + car_clone.getName() +
                "\nColor: " + car_clone.getColor());
    }
}