package Structural.Flyweight.Cars;

public class NewCar implements Car{
    private String color;

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getName() {return null;}

    @Override
    public void getInfo() {}
}
