public class SmartWatch extends SmartDevice {
    private boolean hasHeartRateSensor;
    private boolean hasGPS;

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, int batteryLife, boolean hasHeartRateSensor, boolean hasGPS) {
        super(brand, model, batteryLife);
        this.hasHeartRateSensor = hasHeartRateSensor;
        this.hasGPS = hasGPS;
    }

    public String getBatteryLife() {
        return null;
    }

    public String isHasHeartRateSensor() {
        return null;
    }

    public String isHasGPS() {
        return null;
    }

    // getters y setters
}
