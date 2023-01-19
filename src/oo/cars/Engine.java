package oo.cars;

public class Engine {
    public enum TYPE {Diesel, Gas}
    public int horsePower;
    public TYPE type;

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public void drive(int amount){
        System.out.println("the motor is running with " + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
