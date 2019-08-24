package Printers;

public class Fuser {
    //attribute
    private int fuserID;
    private int voltage;
    private boolean isWork;
    //Constructor

    public Fuser(int fuserID, int voltage, boolean isWork) {
        this.fuserID = fuserID;
        this.voltage = voltage;
        this.isWork = isWork;
    }

    //Setter and Getter

    public int getFuserID() {
        return fuserID;
    }

    public void setFuserID(int fuserID) {
        this.fuserID = fuserID;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }
}
