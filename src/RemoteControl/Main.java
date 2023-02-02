package RemoteControl;

import javax.swing.plaf.nimbus.State;

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
}
