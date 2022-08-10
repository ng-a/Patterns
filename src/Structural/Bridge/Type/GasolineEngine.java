package Structural.Bridge.Type;

public class GasolineEngine implements Engine{
    private final String type = "Gasoline";

    @Override
    public String getType() {
        return type;
    }
}
