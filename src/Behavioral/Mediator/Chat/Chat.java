package Behavioral.Mediator.Chat;

public interface Chat {
    void getMessage(String message);
    void sendMessage(String message, User user);
}
