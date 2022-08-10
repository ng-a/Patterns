package Behavioral.Mediator.Chat;

public class Client implements User {
    private Chat chat;
    private String name;

    public Client(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void getMessage(String message) {
        System.out.println(message + "send to " + this.name);
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }
}
