package oo;

import oo.cars.Car;
import oo.cars.Engine;

public class ooFirstObject {
    public static void main(String[] args) {
        Car c1 = new Car(15,"T1234",new Engine(235, Engine.TYPE.Gas));
        c1.color = "black";
        c1.fuelConsumption = 6.0;
        c1.serialnumber = "T1234";
        c1.fuelAmount = 20.0;
        c1.speed = 100;
        c1.amountOfRepetitions = 1;

        System.out.println(c1.fuelAmount + " l");
        c1.drive();
        System.out.println(c1.fuelAmount + " l");
        System.out.println(c1.speed + " km/h");
        c1.dobreak();
        c1.turboBoost();
        c1.fuelAmount = 80.0;

        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c1.fuelAmount);

        Car c3 = new Car(17, "12544", new Engine(523, Engine.TYPE.Diesel));

        System.out.println(c3.serialnumber);
    }
}
