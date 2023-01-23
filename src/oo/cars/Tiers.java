package oo.cars;

public class Tiers {
    public int TireSize;

    public int brand;

    public Tiers(int size, int brand) {
        this.TireSize = size;
        this.brand = brand;
    }

    public int getSize() {
        return TireSize;
    }

    public void setSize(int size) {
        this.TireSize = size;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }
}
