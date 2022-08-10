package Structural.Composite.Cars;

public class Tesla implements Car {
    private final String name = "Tesla";

    @Override
    public void getInfo() {
        System.out.println("Name: " + name);
    }
}

