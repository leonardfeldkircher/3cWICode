package at.leo.example.cars;

public class Car {
    public String Color;
    public int MaxSpeed;
    public double BasePrice;
    public double BaseConsumption;
    public Manufacturer manufacturer;
    public double CarPrice;




    public Car(String color, int maxSpeed, double basePrice, double baseConsumption) {
        Color = color;
        MaxSpeed = maxSpeed;
        BasePrice = basePrice;
        BaseConsumption = baseConsumption;
    }


    public double CarPrice(){
        this.manufacturer.getSale();
        double CarPrice = (BasePrice / 100 * manufacturer.getSale() + BasePrice);
        return CarPrice;
    }

    public double getCarPrice() {
        this.CarPrice = CarPrice;
        return CarPrice;
    }

    public double getBasePrice() {
        return BasePrice;
    }
}
