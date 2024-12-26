import vehicletype.Car;
import vehicletype.Motorcycle;
import vehicletype.Truck;
import vehicletype.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to public parking!");
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 100));
        parkingLot.addLevel(new Level(2, 80));

        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ789");
        Vehicle motorcycle = new Motorcycle("M1234");
        Vehicle car2 = new Car("TXC9317");

        // Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);
        parkingLot.parkVehicle(car2);
        // Display availability
        parkingLot.displayAvailability();

        // Unpark vehicle
        parkingLot.unparkVehicle(motorcycle);

        // Display updated availability
        parkingLot.displayAvailability();
    }
}