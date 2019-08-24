package Sales;

public class Staff {
    //attribute
    private int staffID;
    private Company company;
    private Person person;
    //Constructor
    public Staff(int staffID, Company company, Person person) {
        this.staffID = staffID;
        this.company = company;
        this.person = person;
    }
    //Setter and Getter
    public int getStaffID() {
        return staffID;
    }
    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
}
