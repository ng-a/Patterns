package Structural.Composite.Cars;

public class Audi implements Car{
    private final String name = "Audi";

    @Override
    public void getInfo() {
        System.out.println("Name: " + name);
    }
}
