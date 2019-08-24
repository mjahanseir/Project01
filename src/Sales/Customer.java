package Sales;

public class Customer {
    //attribute
    private int customerID;
    private Person person;
    private Company company;
    //Constructor

    public Customer(int customerID, Person person, Company company) {
        this.customerID = customerID;
        this.person = person;
        this.company = company;
    }

    //Setter and Getter

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
}
