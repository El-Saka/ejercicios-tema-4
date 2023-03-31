public class SmartPhone extends SmartDevice {
    private int storage; // en GB
    private boolean has5G;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, int batteryLife, int storage, boolean has5G) {
        super(brand, model, batteryLife);
        this.storage = storage;
        this.has5G = has5G;
    }

    public String getBatteryLife() {
        return null;
    }

    public String getStorage() {
        return null;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    // getters y setters
}
