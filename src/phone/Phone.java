package phone;

import java.util.Date;
import java.util.List;

public class Phone {
    private SDCard card;
    private Sim sim;
    private Camera camera;
    private StringBuffer log;

    public Phone(Sim sim, Camera camera, SDCard sdCard) {
        this.camera = camera;
        this.sim = sim;
        this.card = sdCard;
    }

    public void doCall(String number){
        this.sim.doCall(number);
    }
 // Video2 min 9.41
}