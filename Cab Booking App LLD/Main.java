import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Initialize the system
        BookMyCab bookMyCab = new BookMyCab();

        // Add customers
        bookMyCab.addCustomer(new Customer("John", 1, false));
        bookMyCab.addCustomer(new Customer("Aryan", 2, true)); // Already booked
        bookMyCab.addCustomer(new Customer("Zayn", 3, false));

        // Add drivers
        bookMyCab.addDriver(new Driver("Kishore", 2, false));
        bookMyCab.addDriver(new Driver("Ryan", 3, true)); // Already unavailable
        bookMyCab.addDriver(new Driver("Harpreet", 4, false));

        // Assign drivers to customers
        bookMyCab.assignDriversToCustomers();

        // Print remaining available drivers
        bookMyCab.printAvailableDrivers();
    }
}

class Customer {
    String name;
    int uniqueId;
    boolean booked;

    public Customer(String name, int uniqueId, boolean booked) {
        this.name = name;
        this.uniqueId = uniqueId;
        this.booked = booked;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', uniqueId=" + uniqueId + ", booked=" + booked + "}";
    }
}

class Driver {
    String name;
    int driverId;
    boolean isAvailable;

    public Driver(String name, int driverId, boolean isAvailable) {
        this.name = name;
        this.driverId = driverId;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Driver{name='" + name + "', driverId=" + driverId + ", isAvailable=" + isAvailable + "}";
    }
}

class BookMyCab {
    private final List<Customer> customerList = new ArrayList<>();
    private final List<Driver> driverList = new ArrayList<>();

    // Add a customer to the system
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    // Add a driver to the system
    public void addDriver(Driver driver) {
        driverList.add(driver);
    }

    // Assign drivers to customers
    public void assignDriversToCustomers() {
        List<Customer> unbookedCustomers = customerList.stream()
                .filter(customer -> !customer.isBooked())
                .collect(Collectors.toList());

        List<Driver> availableDrivers = driverList.stream()
                .filter(Driver::isAvailable)
                .collect(Collectors.toList());

        if (unbookedCustomers.isEmpty()) {
            System.out.println("No unbooked customers available.");
            return;
        }

        if (availableDrivers.isEmpty()) {
            System.out.println("No available drivers to assign.");
            return;
        }

        Iterator<Customer> customerIterator = unbookedCustomers.iterator();
        Iterator<Driver> driverIterator = availableDrivers.iterator();

        while (customerIterator.hasNext() && driverIterator.hasNext()) {
            Customer customer = customerIterator.next();
            Driver driver = driverIterator.next();

            customer.setBooked(true);
            driver.setAvailable(false);

            System.out.println(driver.name + " is assigned to customer: " + customer.name);
        }

        if (customerIterator.hasNext()) {
            System.out.println("Not all customers could be assigned a driver.");
        }
    }

    // Print all available drivers
    public void printAvailableDrivers() {
        List<Driver> availableDrivers = driverList.stream()
                .filter(Driver::isAvailable)
                .collect(Collectors.toList());

        if (availableDrivers.isEmpty()) {
            System.out.println("No drivers are currently available.");
        } else {
            System.out.println("Available drivers:");
            availableDrivers.forEach(System.out::println);
        }
    }
}
