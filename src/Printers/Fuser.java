package Printers;

public class Fuser {
    //attribute
    private int voltage;
    private boolean isWork;
    //Constructor
    public Fuser(int voltage, boolean isWork) {
        this.voltage = voltage;
        this.isWork = isWork;
    }
    //Setter and Getter

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
