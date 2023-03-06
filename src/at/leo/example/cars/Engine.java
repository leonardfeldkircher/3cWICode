package at.leo.example.cars;

public class Engine {

    public enum TYPE {Diesel, Gas}
    public int HorsePower;
    public TYPE type;

    public Engine(int horsePower, TYPE engineType) {
        HorsePower = horsePower;
        this.type = engineType;
    }
}

