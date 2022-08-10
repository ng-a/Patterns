package Behavioral.Iterator;

public class Main {
    public static void main(String[] args) {
        DateBase date = new DateBase();

        date.createUser("admin", "root");
        date.createUser("user", "password");

        Iterator iterator = date.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
