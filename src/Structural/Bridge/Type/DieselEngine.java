package Structural.Bridge.Type;

public class DieselEngine implements Engine{
    private String type = "Diesel";

    @Override
    public String getType() {
        return this.type;
    }
}
