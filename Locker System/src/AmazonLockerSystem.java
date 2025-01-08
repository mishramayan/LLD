import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AmazonLockerSystem {
    public static void main(String[] args) {
        List<Locker> lockers = new ArrayList<Locker>();
        lockers.add(new Locker("L1", LockerSize.SMALL));
        lockers.add(new Locker("L2", LockerSize.XL));
        lockers.add(new Locker("L4", LockerSize.MEDIUM));
        lockers.add(new Locker("L23", LockerSize.XXL));

        LockerService lockerService = new LockerServiceImpl(lockers);

        // Simulate booking process
        String response = lockerService.bookLocker("Item 213", LockerSize.SMALL, 12.3457, 35.9854, true, LocalDateTime.now());
        System.out.println(response);

        // Open locker using access code
        String accessCode = response.split("Access Code: ")[1];
        System.out.println(accessCode);

        // Handle expired lockers (simulating a later time)
        lockerService.handleExpiredLockers();

        // Simulate booking process
        String response1 = lockerService.bookLocker("Item 213", LockerSize.SMALL, 12.3457, 35.9854, true, LocalDateTime.now());
        System.out.println(response1);

        // Open locker using access code
        String accessCode1 = response.split("Access Code: ")[1];
        System.out.println(accessCode1);

        // Handle expired lockers (simulating a later time)
        lockerService.handleExpiredLockers();
    }
}
