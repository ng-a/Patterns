package Structural.Decorator;

import Structural.Decorator.Decorators.*;
import Structural.Decorator.Notifications.*;

public class Main {
    public static void main(String[] args) {
        Notifier sms = new Notification("Some text");
        System.out.println(sms.sendMessage());

        sms = new SmsNotifier(new TelegramNotifier(new Notification("New sms")));
        System.out.println(sms.sendMessage());
    }
}