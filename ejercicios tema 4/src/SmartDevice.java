public class SmartDevice{
    private String brand;
    private String model;
    private int batteryLife; // en horas

    public SmartDevice() {
    }

    public SmartDevice(String brand, String model, int batteryLife) {
        this.brand = brand;
        this.model = model;
        this.batteryLife = batteryLife;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // getters y setters
}
