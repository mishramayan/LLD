public class CustomerInterfaceImpl implements CustomerInterface {
    private final String name;
    private final long uniqueId;
    private boolean booked;

    public CustomerInterfaceImpl(String name, long uniqueId, boolean isAvailable) {
        this.name = name;
        this.uniqueId = uniqueId;
        this.booked = isAvailable;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getUniqueId() {
        return uniqueId;
    }

    @Override
    public boolean isBooked() {
        return booked;
    }

    @Override
    public void setBooked(boolean booked) {
        this.booked = booked;
    }
}
