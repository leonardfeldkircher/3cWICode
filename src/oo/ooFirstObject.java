package oo;

import oo.cars.car;

public class ooFirstObject {
    public static void main(String[] args) {
        car c1 = new car();
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
    }
}
