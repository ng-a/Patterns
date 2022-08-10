package Structural.Flyweight.Cars;

public class Tesla extends NewCar {
    private final String name = "Tesla";

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void getInfo() {
        System.out.println(
                "\nName: " + this.name +
                "\nColor: " + super.getColor());
    }
}

