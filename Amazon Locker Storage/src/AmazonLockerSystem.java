import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AmazonLockerSystem {
    public static void main(String[] args) {
        List<Locker> lockers = new ArrayList<Locker>();
        lockers.add(new Locker("L1", LockerSize.SMALL));
        lockers.add(new Locker("L2", LockerSize.MEDIUM));
        lockers.add(new Locker("L3", LockerSize.LARGE));
        lockers.add(new Locker("L4", LockerSize.SMALL));
        lockers.add(new Locker("L5", LockerSize.MEDIUM));
        lockers.add(new Locker("L6", LockerSize.XL));
        lockers.add(new Locker("L7", LockerSize.XXL));

        LockerService lockerService = new LockerServiceImpl(lockers);

        String response = lockerService.bookLocker("item123", LockerSize.MEDIUM, 12.1917, 38.1873, true, LocalDateTime.now());
        System.out.println(response);
        String response2 = lockerService.bookLocker("item345", LockerSize.MEDIUM, 12.1917, 38.1873, true, LocalDateTime.now().plusDays(4));
        System.out.println(response2);
        String response3 = lockerService.bookLocker("item456", LockerSize.XXL, 12.1917, 38.1873, true, LocalDateTime.now());
        System.out.println(response3);
    }
}
