import java.time.LocalDateTime;

public class Locker {
    public final String lockerId;
    public final LockerSize lockerSize;
    public LockerStatus status;
    private LocalDateTime bookedUntil;
    private String accessCode;

    public Locker(String lockerId, LockerSize lockerSize) {
        this.lockerId = lockerId;
        this.lockerSize = lockerSize;
        this.status = LockerStatus.FREE;
    }

    public String getLockerId() {
        return lockerId;
    }

    public LockerSize getLockerSize() {
        return lockerSize;
    }

    public LockerStatus getStatus() {
        return status;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void bookLocker(LocalDateTime until, String code) {
        this.status = LockerStatus.BOOKED;
        bookedUntil = until;
        this.accessCode = code;
    }

    public void freeLocker(){
        this.status = LockerStatus.FREE;
        this.bookedUntil = null;
        this.accessCode = null;
    }

    public boolean isExpired(){
        return status == LockerStatus.BOOKED && bookedUntil != null && LocalDateTime.now().isAfter(bookedUntil);
    }

    public boolean unlockLocker(String code){
        if(this.accessCode != null && this.accessCode.equals(code)){
            freeLocker();
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Locker{" +
                "lockerId: " + lockerId + '\'' +
                ", size: " + lockerSize +
                ", status: " + status +
                '}';
    }
}
