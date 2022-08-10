package Structural.Decorator.Decorators;

import Structural.Decorator.Notifications.*;

public class SmsNotifier extends Decorator {
    public SmsNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String sendMessage() {
        return super.sendMessage() + "SMS";
    }
}
