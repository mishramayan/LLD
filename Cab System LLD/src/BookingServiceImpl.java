import java.util.ArrayList;
import java.util.List;

public class BookingServiceImpl implements BookingService {
    private final List<CustomerInterfaceImpl> customerList = new ArrayList<>();
    private final List<DriverInterfaceImpl> driverList = new ArrayList<>();

    @Override
    public void addCustomer(CustomerInterfaceImpl customer) {
        customerList.add(customer);
    }

    @Override
    public void addDriver(DriverInterfaceImpl driver) {
        driverList.add(driver);
    }

    @Override
    public void assignDriversToCustomers() {
        int driverIndex = 0, customerIndex = 0;

        while(driverIndex < driverList.size() && customerIndex < customerList.size()) {
            // Get the current customer and driver
            CustomerInterfaceImpl customer = customerList.get(customerIndex);
            DriverInterfaceImpl driver = driverList.get(driverIndex);

            // Skip booked customers
            while (customerIndex < customerList.size() && customer.isBooked()) {
                customerIndex++;
                if (customerIndex < customerList.size()) {
                    customer = customerList.get(customerIndex);
                }
            }

            // Skip unavailable drivers
            while (driverIndex < driverList.size() && !driver.isAvailable()) {
                driverIndex++;
                if (driverIndex < driverList.size()) {
                    driver = driverList.get(driverIndex);
                }
            }

            // Check if indices are still valid before assigning
            if (driverIndex < driverList.size() && customerIndex < customerList.size()) {
                System.out.println(driver.getName() + " is assigned to customer " + customer.getName());

                // Mark the customer as booked and the driver as unavailable
                customer.setBooked(true);
                driver.setDriverAvailability(false);

                // Move to the next customer and driver
                customerIndex++;
                driverIndex++;
            }
        }
    }
}
