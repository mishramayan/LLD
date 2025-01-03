public interface BookingService {
    void addCustomer(CustomerInterfaceImpl customer);
    void addDriver(DriverInterfaceImpl driver);
    void assignDriversToCustomers();
}
