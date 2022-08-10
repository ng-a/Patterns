package Behavioral.Template;

import Behavioral.Template.Developer.Developer;
import Behavioral.Template.Developer.JavaDeveloper;
import Behavioral.Template.Developer.PhpDeveloper;

public class Main {
    public static void main(String[] args) {
        Developer Maks = new JavaDeveloper("Maks");
        Developer Bob = new PhpDeveloper("Bob");

        Maks.info();
        Bob.info();
    }
}
