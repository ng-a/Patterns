package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Time.getTime().setTime(8);
        System.out.println("hours: " + Time.getTime());

        Time.getTime().setTime(5);
        System.out.println("hours: " + Time.getTime());
    }
}