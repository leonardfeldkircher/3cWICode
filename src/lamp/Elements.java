package lamp;

public class Elements {
    private String Name;
    private String Color;
    private double Power;
    public enum State {On, Off};
    public State state;
    public Lamp lamp;

    public Elements(String name, String color, double power, State state) {
        Name = name;
        Color = color;
        Power = power;
        this.state = state;
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

    public double getPower() {
        return Power;
    }

    public void setPower(double power) {
        Power = power;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }
}
