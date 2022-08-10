package Behavioral.Visitor;

import Behavioral.Visitor.Developer.Developer;
import Behavioral.Visitor.Developer.JavaDeveloper;
import Behavioral.Visitor.Developer.PhpDeveloper;
import Behavioral.Visitor.Visitor.DeveloperVisitor;

public class Main {
    public static void main(String[] args) {
        Developer java = new JavaDeveloper("Maks");
        java.info(new DeveloperVisitor());

        Developer php = new PhpDeveloper("Bob");
        php.info(new DeveloperVisitor());
    }
}
