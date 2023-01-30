package RemoteControl;

public class Battery {
    private double state;

    public Battery(double state){
        this.state = state;
    }

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
    }

    public void getStatus(){
        //getState()
    }
}
