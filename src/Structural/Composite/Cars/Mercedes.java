package Structural.Composite.Cars;

public class Mercedes implements Car{
    private final String name = "Mercedes";

    @Override
    public void getInfo() {
        System.out.println("Name: " + name);
    }
}
