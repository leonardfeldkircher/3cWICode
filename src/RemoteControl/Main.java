package RemoteControl;

public class Main {

    private Battery battery1;
    private Battery battery2;

    private int state;

    public Main(Battery battery1, Battery battery2) {
        this.battery1 = battery1;
        this.battery2 = battery2;
    }

    public double getStatus(){
      double state = (battery1.getState() + battery2.getState() / 2);
      return state;
    }

    public String turnOn(){
        this.battery1.setState(battery1.getState()-5);
        this.battery2.setState(battery2.getState()-5);
        String on = "Verbraucher angeschlossen";
        return on;
    }

    public String turnOff(){
        String off = "Kein Verbraucher angeschlossen";
        return off;
    }

    public Battery getBattery1(){
        return battery1;
    }

    public Battery getBattery2() {
        return battery2;
    }
}
