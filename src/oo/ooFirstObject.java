package oo;

import oo.cars.car;

public class ooFirstObject {
    public static void main(String[] args) {
        car c1 = new car();
        c1.color = "black";
        c1.fuelConsumption = 6.0;
        c1.serialnumber = "T1234";
        c1.fuelAmount = 80.0;

        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c1.fuelAmount);
    }
}
