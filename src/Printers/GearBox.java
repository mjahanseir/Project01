package Printers;

public class GearBox {
    //attribute
    private int gearBoxID;
    private String type;
    //Constructor

    public GearBox(int gearBoxID, String type) {
        this.gearBoxID = gearBoxID;
        this.type = type;
    }

    //Setter and Getter

    public int getGearBoxID() {
        return gearBoxID;
    }

    public void setGearBoxID(int gearBoxID) {
        this.gearBoxID = gearBoxID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
