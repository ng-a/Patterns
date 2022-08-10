package Creational.Prototype;

public interface Car {
    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    Car clone();
}
