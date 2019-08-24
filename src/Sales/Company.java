package Sales;

public class Company {
    //attribute
    private int companyID;
    private String companyName;
    private String companyState;
    private String companyCity;
    private String companyAddress;
    private int companyPhone;
    //Constructor
    public Company(int companyID, String companyName, String companyState, String companyCity, String companyAddress, int companyPhone) {
        this.companyID = companyID;
        this.companyName = companyName;
        this.companyState = companyState;
        this.companyCity = companyCity;
        this.companyAddress = companyAddress;
        this.companyPhone = companyPhone;
    }
    //Setter and Getter
    public int getCompanyID() {
        return companyID;
    }
    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyState() {
        return companyState;
    }
    public void setCompanyState(String companyState) {
        this.companyState = companyState;
    }
    public String getCompanyCity() {
        return companyCity;
    }
    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }
    public String getCompanyAddress() {
        return companyAddress;
    }
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
    public int getCompanyPhone() {
        return companyPhone;
    }
    public void setCompanyPhone(int companyPhone) {
        this.companyPhone = companyPhone;
    }
}
