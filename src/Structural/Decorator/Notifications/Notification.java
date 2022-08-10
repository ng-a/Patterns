package Structural.Decorator.Notifications;

public class Notification implements Notifier{
    private String text;

    public Notification(String text){
        this.text = text;
    }
    @Override
    public String sendMessage() {
        return text;
    }
}
