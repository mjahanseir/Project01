package Printers;

public class Printer {
    //attribute
    private int printerID;
    private boolean duplex;
    private Device device;
    private Toner toner;
    private Fuser fuser;
    private GearBox gearBox;
    //Constructor

    public Printer(int printerID, boolean duplex, Device device, Toner toner, Fuser fuser, GearBox gearBox) {
        this.printerID = printerID;
        this.duplex = duplex;
        this.device = device;
        this.toner = toner;
        this.fuser = fuser;
        this.gearBox = gearBox;
    }

    //Setter and Getter

    public int getPrinterID() {
        return printerID;
    }

    public void setPrinterID(int printerID) {
        this.printerID = printerID;
    }

    public boolean isDuplex() {
        return duplex;
    }
    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
    public Device getDevice() {
        return device;
    }
    public void setDevice(Device device) {
        this.device = device;
    }
    public Toner getToner() {
        return toner;
    }
    public void setToner(Toner toner) {
        this.toner = toner;
    }
    public Fuser getFuser() {
        return fuser;
    }

    public void setFuser(Fuser fuser) {
        this.fuser = fuser;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }
}
