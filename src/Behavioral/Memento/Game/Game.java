package Behavioral.Memento.Game;

import java.util.Date;

public class Game {
    private Date date;
    private String name;
    private String version;

    public Game(String name, String version) {
        this.date = new Date();
        this.name = name;
        this.version = version;
    }

    public void setName(String name) {
        this.date = new Date();
        this.name = name;
    }

    public void setVersion(String version) {
        this.date = new Date();
        this.version = version;
    }

    public Save save() {
        return new Save(this.date, this.name, this.version);
    }

    public void load(Save save) {
        this.date = save.getDate();
        this.name = save.getName();
        this.version = save.getVersion();
    }


    @Override
    public String toString() {
        return "\tGame" +
                "\nname: " + name +
                "\nversion: " + version +
                "\ndate: " + date;
    }
}
