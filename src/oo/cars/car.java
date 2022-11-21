package oo.cars;

public class car {
    public String color;
    public double fuelConsumption;
    public String serialnumber;
    public double fuelAmount;
    public int speed;
    public int amountOfRepetitions;


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

    }

    public void getRemainingRange() {
        System.out.println("Verbleibende Reichweite");
        getRemainingRange = this.fuelAmount/this.fuelConsumption * 100;
    }
}

