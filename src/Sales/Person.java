package Sales;

public class Person {

    //attribute
    private int personID;
    private String personFristName;
    private String personLastName;
    private String personEmail;
    private int personPhone;
    //Constructor
    public Person(int personID, String personFristName, String personLastName, String personEmail, int personPhone) {
        this.personID = personID;
        this.personFristName = personFristName;
        this.personLastName = personLastName;
        this.personEmail = personEmail;
        this.personPhone = personPhone;
    }
    //Setter and Getter
    public int getPersonID() {
        return personID;
    }
    public void setPersonID(int personID) {
        this.personID = personID;
    }
    public String getPersonFristName() {
        return personFristName;
    }
    public void setPersonFristName(String personFristName) {
        this.personFristName = personFristName;
    }
    public String getPersonLastName() {
        return personLastName;
    }
    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }
    public String getPersonEmail() {
        return personEmail;
    }
    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }
    public int getPersonPhone() {
        return personPhone;
    }
    public void setPersonPhone(int personPhone) {
        this.personPhone = personPhone;
    }
}
