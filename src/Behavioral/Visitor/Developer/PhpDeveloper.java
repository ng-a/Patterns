package Behavioral.Visitor.Developer;

import Behavioral.Visitor.Visitor.Visitor;

public class PhpDeveloper implements Developer {
    private String name;

    public PhpDeveloper(String name) {
        this.name = name;
    }

    @Override
    public void info(Visitor visitor) {
        visitor.infoPhp(name);
    }
}
