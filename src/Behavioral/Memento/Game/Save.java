package Behavioral.Memento.Game;

import java.util.Date;

public class Save {
    private final Date date;
    private final String name;
    private final String version;

    public Save(Date date, String name, String version) {
        this.date = date;
        this. name = name;
        this.version = version;
    }

    public Date getDate() {
        return this.date;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }
}
