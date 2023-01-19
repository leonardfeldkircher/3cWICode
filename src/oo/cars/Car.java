package oo.cars;

public class Car {
    public Engine engine;
    public String color;
    public double fuelConsumption;
    public String serialnumber;
    public double fuelAmount;
    public int speed;
    public int amountOfRepetitions;
    public int getRemainingRange;

    public Car(int fc, String sn, Engine engine){
        this.engine = engine;
        this.fuelConsumption = fc;
        this.serialnumber = sn;
    }


    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        this.speed = 100;
        System.out.println("gt86 is driving");
    }

    public void dobreak() {
        this.speed = 0;
        System.out.println("Ich bremse");
        System.out.println(speed + " km/h");
    }

    public void turboBoost() {
        if (this.fuelAmount < 0.6) {
            System.out.println("SuperBoostMode");
        }
        else {
            System.out.println("Not enouth fuel to go SuperBoost");
        }
    }

    public void honk() {
        System.out.println("Car has " + this.color + this.fuelAmount + this.getEngine().getHorsePower() + " ps");
    }

    public void getRemainingRange() {
        System.out.println("Verbleibende Reichweite");
        this.getRemainingRange = (int) (this.fuelAmount/this.fuelConsumption * 100);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setGetRemainingRange(int getRemainingRange) {
        this.getRemainingRange = getRemainingRange;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }

    public int getGetRemainingRange() {
        return getRemainingRange;
    }
}

