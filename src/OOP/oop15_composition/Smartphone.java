package OOP.oop15_composition;

public class Smartphone {

    private String brand;
    private String model;
    private Battery battery;

    Smartphone(String brand, String model, String batteryType, double capacity) {
        setBrand(brand);
        setModel(model);

        this.battery = new Battery(batteryType, capacity);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank()) {
            this.model = model;
        }
    }

    void showPhoneInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        battery.showBatteryInfo();

    }
}