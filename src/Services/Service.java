package Services;

import Printers.*;
import Sales.*;

import java.time.LocalDateTime;
import java.util.List;

public class Service {
    //attribute
    private int serviceID;
    private List<Printer> printer;
    private List<Staff> staff;
    private List<Customer> customer;
    private LocalDateTime dayService;
    //Constructor
    public Service(int serviceID, List<Printer> printer, List<Staff> staff, List<Customer> customer, LocalDateTime dayService) {
        this.serviceID = serviceID;
        this.printer = printer;
        this.staff = staff;
        this.customer = customer;
        dayService =  LocalDateTime.now();
        this.dayService =dayService;
    }
    //Setter and Getter

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public List<Printer> getPrinter() {
        return printer;
    }

    public void setPrinter(List<Printer> printer) {
        this.printer = printer;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    public LocalDateTime getDayService() {
        return dayService;
    }

    public void setDayService(LocalDateTime dayService) {
        this.dayService = dayService;
    }
}
