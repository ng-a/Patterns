package Behavioral.Visitor.Visitor;

public class DeveloperVisitor implements Visitor {
    @Override
    public void infoJava(String name) {
        System.out.println(name + " Java developer");
    }

    @Override
    public void infoPhp(String name) {
        System.out.println(name + " Php developer");
    }
}
