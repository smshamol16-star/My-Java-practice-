package OOP.oop15_composition;

public class Battery {

    private double capacity;
    private String type;

    Battery(String type, double capacity) {
        setType(type);
        setCapacity(capacity);
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null && !type.isBlank()) {
            this.type = type;
        }
    }

    void showBatteryInfo() {
        System.out.println("Battery Type: " + type);
        System.out.println("Capacity: " + capacity + " mAh");

    }
}