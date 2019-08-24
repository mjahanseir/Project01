package Printers;

public class Toner {
    //attribute
    private int tonerLevel;
    private int pagePrinted;
    private boolean color;
    //Constructor
    public Toner(int tonerLevel, int pagePrinted, boolean color) {
        this.tonerLevel = tonerLevel;
        this.pagePrinted = pagePrinted;
        this.color = color;
    }
    //Setter and Getter
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
