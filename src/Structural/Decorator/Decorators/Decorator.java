package Structural.Decorator.Decorators;

import Structural.Decorator.Notifications.*;

public class Decorator implements Notifier {
    private Notifier notifier;

    public Decorator(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public String sendMessage() {
        return notifier.sendMessage() + " send ";
    }
}
