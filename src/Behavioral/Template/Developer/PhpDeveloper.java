package Behavioral.Template.Developer;

public class PhpDeveloper extends Developer {

    public PhpDeveloper(String name) {
        super(name);
    }

    @Override
    public void info() {
        System.out.println(super.getName() + " Php developer");
    }
}
