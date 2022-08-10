package Structural.Bridge.Type;

public class ElectricEngine implements Engine{
    private final String type = "Electric";

    @Override
    public String getType() {
        return this.type;
    }
}
