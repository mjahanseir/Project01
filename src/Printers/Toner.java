package Printers;

public class Toner {
    //attribute
    private int tonerID;
    private int tonerLevel;
    private int pagePrinted;
    private boolean color;
    //Constructor

    public Toner(int tonerID, int tonerLevel, int pagePrinted, boolean color) {
        this.tonerID = tonerID;
        this.tonerLevel = tonerLevel;
        this.pagePrinted = pagePrinted;
        this.color = color;
    }

    //Setter and Getter

    public int getTonerID() {
        return tonerID;
    }

    public void setTonerID(int tonerID) {
        this.tonerID = tonerID;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }
    public int getPagePrinted() {
        return pagePrinted;
    }
    public void setPagePrinted(int pagePrinted) {
        this.pagePrinted = pagePrinted;
    }
    public boolean isColor() {
        return color;
    }
    public void setColor(boolean color) {
        this.color = color;
    }
}
