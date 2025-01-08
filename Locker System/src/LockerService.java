import java.time.LocalDateTime;
import java.util.List;

public interface LockerService {
    List<Locker> findAvailableLockers(LockerSize size, double latitude, double longitude);
    String bookLocker(String itemId, LockerSize size, double latitude, double longitude, boolean paymentStatus, LocalDateTime expectedDelivery);
    void releaseLocker(String lockerId);
    void handleExpiredLockers();
    boolean openLocker(String lockerId, String accessCode);
}
