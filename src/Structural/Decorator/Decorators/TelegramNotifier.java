package Structural.Decorator.Decorators;

import Structural.Decorator.Notifications.*;

public class TelegramNotifier extends Decorator {
    public TelegramNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String sendMessage() {
        return super.sendMessage() + "Telegram";
    }
}
