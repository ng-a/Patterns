package Behavioral.Mediator.Chat;

import java.util.HashSet;

public class TextChat implements Chat{
    private HashSet<User> users = new HashSet<>();

    public void addClient(User user) {
        this.users.add(user);
    }

    @Override
    public void getMessage(String message) {

    }

    @Override
    public void sendMessage(String message, User user) {
        for (User client: this.users) {
            if(client != user) {
                client.getMessage(user.getName() + ": " + message + " ");
            }
        }
    }
}
