public class DriverInterfaceImpl implements DriverInterface {
    private final String name;
    private final long driverId;
    private boolean isAvailable;

    public DriverInterfaceImpl(String name, long driverId, boolean isAvailable) {
        this.name = name;
        this.driverId = driverId;
        this.isAvailable = isAvailable;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getDriverId() {
        return driverId;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void setDriverAvailability(boolean availability) {
        this.isAvailable = availability;
    }
}
