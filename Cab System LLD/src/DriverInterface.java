public interface DriverInterface {
    String getName();
    long getDriverId();
    boolean isAvailable();
    void setDriverAvailability(boolean availability);
}
