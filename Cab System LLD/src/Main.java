public class Main {
    public static void main(String[] args) {
        BookingService bookingService = new BookingServiceImpl();

        // Add customers
        bookingService.addCustomer(new CustomerInterfaceImpl("John", 1, true));
        bookingService.addCustomer(new CustomerInterfaceImpl("Aryan", 2, false));
        bookingService.addCustomer(new CustomerInterfaceImpl("Zayn", 3, false));

        // Add drivers
        bookingService.addDriver(new DriverInterfaceImpl("Kishore", 2, true));
        bookingService.addDriver(new DriverInterfaceImpl("Ryan", 3, true));
        bookingService.addDriver(new DriverInterfaceImpl("Harpreet", 4, false));

        bookingService.assignDriversToCustomers();
    }
}
