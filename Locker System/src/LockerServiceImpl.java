import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LockerServiceImpl implements LockerService {
    private final List<Locker> lockers;

    public LockerServiceImpl(List<Locker> lockers) {
        this.lockers = lockers;
    }


    /**
     * @param size
     * @param latitude
     * @param longitude
     * @return
     */
    @Override
    public List<Locker> findAvailableLockers(LockerSize size, double latitude, double longitude) {
        List<Locker> availableLockers = new ArrayList<Locker>();
        for(Locker locker : lockers) {
            if(locker.getLockerSize().equals(size) && locker.getStatus() == LockerStatus.FREE) {
                availableLockers.add(locker);
            }
        }
        return availableLockers;
    }

    /**
     * @param itemId
     * @param size
     * @param latitude
     * @param longitude
     * @param paymentStatus
     * @param expectedDelivery
     * @return
     */
    @Override
    public String bookLocker(String itemId, LockerSize size, double latitude, double longitude, boolean paymentStatus, LocalDateTime expectedDelivery) {
        if(!paymentStatus){
            return "Payment not successful. Locker not booked.";
        }

        List<Locker> availableLockers = findAvailableLockers(size, latitude, longitude);
        if(availableLockers.isEmpty()){
            return "No available lockers.";
        }

        Locker locker = availableLockers.get(0);
        String accessCode = locker.getAccessCode();
        locker.bookLocker(expectedDelivery.plusDays(3), accessCode);

        return "Locker booked successfully. Locker ID: " + locker.getLockerId() + ". Access Code: " + accessCode;
    }

    /**
     * @param lockerId
     */
    @Override
    public void releaseLocker(String lockerId) {
        for(Locker locker : lockers){
            if(locker.getLockerId().equals(lockerId)){
                locker.freeLocker();
                System.out.println("Locker " + lockerId + " is now free.");
                break;
            }
        }
    }

    /**
     *
     */
    @Override
    public void handleExpiredLockers() {
for(Locker locker : lockers){
    if(locker.isExpired()){
        releaseLocker(locker.getLockerId());
        System.out.println("Item in locker " + locker.getLockerId() + " has been scheduled for refund.");
    }
}
    }

    /**
     * @param lockerId
     * @param accessCode
     * @return
     */
    @Override
    public boolean openLocker(String lockerId, String accessCode) {
        for(Locker locker : lockers){
            if(locker.getLockerId().equals(lockerId)){
                if(locker.unlockLocker(accessCode)){
                    System.out.println("Locker " + lockerId + " opened successfully.");
                    return true;
                } else {
                    System.out.println("Invalid access code for locker " + lockerId + ".");
                    return false;
                }
            }
        }
        System.out.println("Locker " + lockerId + " not found.");
        return false;
    }

    public String generateAccessCode(){
        Random random = new Random();
        int code = 100000 + random.nextInt(900000);
        return String.valueOf(code);
    }
}
