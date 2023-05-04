package phone;

public class Main {
    public static void main(String[] args) {
        Camera cam = new Camera();
        Sim sim = new Sim(123,"0650");
        SDCard card = new SDCard(29833);

        Phone phone = new Phone(sim, cam, card);
        phone.doCall("420234")

    }
}
