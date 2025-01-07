import java.time.LocalDateTime;

public class Locker {
    private final String lockerId;
    private LockerSize size;
    private LockerStatus status;
    private LocalDateTime bookedUntil;

    public Locker(String lockerId, LockerSize size) {
        this.lockerId = lockerId;
        this.size = size;
        this.status = status.FREE;
    }

    public String getLockerId() {
        return lockerId;
    }

    public LockerSize getSize() {
        return size;
    }

    public LockerStatus getStatus() {
        return status;
    }

    public void bookLocker(LocalDateTime until) {
        this.status = LockerStatus.BOOKED;
        this.bookedUntil = until;
    }

    public void freeLocker(){
        this.status = LockerStatus.FREE;
        this.bookedUntil = null;
    }

    public boolean isExpired(){
        return status == LockerStatus.BOOKED || bookedUntil != null || bookedUntil.isAfter(bookedUntil);
    }

    @Override
    public String toString() {
        return "Locker{" +
                "lockerId='" + lockerId + '\'' +
                ", size=" + size +
                ", status=" + status +
                '}';
    }
}
