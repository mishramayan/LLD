
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        BookMyCab book = new BookMyCab();
        
        book.getCustomerList().add(new Customer("John", 1, false));
        book.getCustomerList().add(new Customer("Aryan", 2, true));
        book.getCustomerList().add(new Customer("Zayn", 3, false));
        
        book.getDriverList().add(new Driver("Kishore", 2, false));
        book.getDriverList().add(new Driver("Ryan", 3, true));
        book.getDriverList().add(new Driver("Harpreet", 4, true));
        
        List<Driver> driverList = book.getDriverList();
        List<Customer> customerList = book.getCustomerList();
        
        int driverIndex = 0;
        int customerIndex = 0;
        
        while (driverIndex < driverList.size() && customerIndex < customerList.size()) {
            if (customerList.get(customerIndex).booked) {
                customerIndex++;
                continue;
            }

            if (!driverList.get(driverIndex).isAvailable) {
                driverIndex++;
                continue;
            }

            System.out.println(driverList.get(driverIndex).name + " is assigned to customer: " + customerList.get(customerIndex).name);

            // Mark customer as booked and driver as unavailable
            customerList.get(customerIndex).booked = true;
            driverList.get(driverIndex).isAvailable = false;

            customerIndex++;
            driverIndex++;
        }
        
    }
}

class Customer{
    String name;
    int uniqueId;
    boolean booked;
    
    public Customer(String name, int uniqueId, boolean booked){
        this.name = name;
        this.uniqueId = uniqueId;
        this.booked = booked;
    }
}

class Driver{
    String name;
    int driverId;
    boolean isAvailable;
    
    public Driver(String name, int driverId, boolean isAvailable){
        this.name = name;
        this.driverId = driverId;
        this.isAvailable = isAvailable;
    }
}

class BookMyCab{
    List<Customer> customerList = new ArrayList();
    List<Driver> driverList = new ArrayList();
    
    public List<Customer> getCustomerList(){
        return customerList;
    }
    
    public List<Driver> getDriverList(){
        return driverList;
    }
}





