package RemoteControl;

public class Tester {
    public static void main(String[] args) {
        Battery battery1 = new Battery(100);
        Battery battery2 = new Battery(90);

        Main Main1 = new Main(battery1, battery2);

        System.out.println("Akkustand " + Main1.getStatus());

        System.out.println(battery1.getState());
        System.out.println(battery2.getState());

        System.out.println(Main1.turnOn());
        System.out.println("Neuer Akkustand: " + Main1.getStatus());

        System.out.println(battery1.getState());
        System.out.println(battery2.getState());

        System.out.println(Main1.turnOff());
    }
}
