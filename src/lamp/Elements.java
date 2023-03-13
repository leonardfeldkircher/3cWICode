package lamp;

public class Elements {
    private String Name;
    private String Color;
    private enum State {On, Off};
    private State state;

    public Elements(String name, String color, State type) {
        Name = name;
        Color = color;
        this.state = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public State getType() {
        return state;
    }

    public void setType(State type) {
        this.state = type;
    }
}
