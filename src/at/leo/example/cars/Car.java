package at.leo.example.cars;

public class Car {
    public String Color;
    public int MaxSpeed;
    public double BasePrice;
    public double BaseConsumption;
    public Manufacturer manufacturer;
    double CarPrice;




    public Car(String color, int maxSpeed, double basePrice, double baseConsumption) {
        Color = color;
        MaxSpeed = maxSpeed;
        BasePrice = basePrice;
        BaseConsumption = baseConsumption;
    }


    public void Price(){
        this.manufacturer.getSale();
        double CarPrice = BasePrice / 100 * this.manufacturer.getSale() + BasePrice;
    }
}
