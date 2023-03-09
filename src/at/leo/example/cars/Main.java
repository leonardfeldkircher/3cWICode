package at.leo.example.cars;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(344, Engine.TYPE.Gas);
        Manufacturer m1 = new Manufacturer("Audi","Österreich",15);
        Car c1 = new Car("Black",250,50.000,5);

        System.out.println();
        System.out.println(c1.getCarPrice());
    }
}
