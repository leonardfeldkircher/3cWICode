package RemoteControl;

public class Tester {
    public static void main(String[] args) {
        Battery battery1 = new Battery(100);
        Battery battery2 = new Battery(90);


        System.out.println(battery1.getState());
        System.out.println(battery2.getState());

    }
}
