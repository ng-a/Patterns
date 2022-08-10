package Behavioral.Mediator;

import Behavioral.Mediator.Chat.Client;
import Behavioral.Mediator.Chat.TextChat;
import Behavioral.Mediator.Chat.User;

public class Main {
    public static void main(String[] args) {
        TextChat textChat = new TextChat();

        User user1 = new Client(textChat, "user1");
        User user2 = new Client(textChat, "user2");
        User user3 = new Client(textChat, "user3");

        textChat.addClient(user1);
        textChat.addClient(user2);
        textChat.addClient(user3);

        user1.sendMessage("hello");
        user3.sendMessage("hello");
    }
}
