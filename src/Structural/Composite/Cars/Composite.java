package Structural.Composite.Cars;

import java.util.List;
import java.util.ArrayList;

public class Composite implements Car{
    private List<Car> components = new ArrayList<>();

    public void add(Car component) {
        components.add(component);
    }

    public void remove(Car component) {
        components.remove(component);
    }

    @Override
    public void getInfo() {
        for(Car component : components) {
            component.getInfo();
        }
    }
}
