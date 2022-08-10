package Creational.Prototype;


public class CreateCar implements Car {
    private String name;
    private String color;

    public CreateCar() {}

    public CreateCar(CreateCar temp) {
        this.name = temp.name;
        this.color = temp.color;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Car clone() {
        return new CreateCar(this);
    }

}
