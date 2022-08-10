package Structural.Flyweight.Cars;

public class Audi extends NewCar{
    private final String name = "Audi";

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
