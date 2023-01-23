package oo.cars;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine( 312, Engine.TYPE.Diesel);
        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90,-40);
        Tiers t1 = new Tiers(17,23);
        Tiers t2 = new Tiers(17,23);
        Tiers t3 = new Tiers(17,23);
        Tiers t4 = new Tiers(17,23);

        Car c1 = new Car(25,"T1234",new Engine(435, Engine.TYPE.Gas));
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addTire(t1);
        c1.addTire(t2);
        c1.addTire(t3);
        c1.addTire(t4);

        System.out.println(c1.getMirrors().get(0).getPosition());

        System.out.println(c1.getEngine().getHorsePower());
    }
}
