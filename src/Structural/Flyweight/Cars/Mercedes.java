package Structural.Flyweight.Cars;

public class Mercedes extends NewCar{
    private final String name = "Mercedes";

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
