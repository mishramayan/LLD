import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LockerServiceImpl implements LockerService {
    private final List<Locker> lockers;

    public LockerServiceImpl(List<Locker> lockers) {
        this.lockers = lockers;
    }

    @Override
    public List<Locker> findAvailableLockers(LockerSize size, double latitude, double longitude) {
        List<Locker> availableLockers = new ArrayList<Locker>();
        for(Locker locker : lockers) {
            if(locker.getSize() == size && locker.getStatus() == LockerStatus.FREE){
                availableLockers.add(locker);
            }
        }
        return availableLockers;
    }

    @Override
    public String bookLocker(String itemId, LockerSize size, double latitude, double longitude, boolean paymentStatus, LocalDateTime expectedDelivery) {
        if(!paymentStatus) {
            return "Payment not Successful. Locker not booked.";
        }

        List<Locker> availableLockers = findAvailableLockers(size, latitude, longitude);
        if(availableLockers.isEmpty()) {
            return "No available lockers. Locker not booked.";
        }

        Locker locker = availableLockers.get(0);
        locker.bookLocker(expectedDelivery.plusDays(3));

        return "Locker booked successfully. Locker ID: " + locker.getLockerId();
    }

    @Override
    public void releaseLocker(String lockerId) {
        for(Locker locker : lockers) {
            if(locker.getLockerId().equals(lockerId)) {
                locker.freeLocker();
                System.out.println("Locker released successfully. Locker ID: " + lockerId);
                break;
            }
        }
    }

    @Override
    public void handleExpiredLocker() {
        for(Locker locker : lockers) {
            if(locker.isExpired()){
                releaseLocker(locker.getLockerId());
                System.out.println("Item in locker " + locker.getLockerId() + " has been sheduled for refund!s");
            }
        }
    }
}
