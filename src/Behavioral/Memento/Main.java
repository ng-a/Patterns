package Behavioral.Memento;

import Behavioral.Memento.Game.Game;
import Behavioral.Memento.Game.Save;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Save save;
        Game game = new Game("test", "1.0");

        save = game.save();
        System.out.println("\nCreate and save game");
        System.out.println(game);
        Thread.sleep(10000);

        game.setVersion("1.1t");
        System.out.println("\nChange version game");
        System.out.println(game);

        game.load(save);
        System.out.println("\nLoad first version game");
        System.out.println(game);

    }
}
