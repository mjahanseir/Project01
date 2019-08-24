package Sales;

public class Customer {
    //attribute
    private Person person;
    private Company company;
    //Constructor
    public Customer(Person person, Company company) {
        this.person = person;
        this.company = company;
    }
    //Setter and Getter
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
