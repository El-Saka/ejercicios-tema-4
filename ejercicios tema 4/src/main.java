public class main {
    public static void main(String[] args){
        SmartPhone iPhone = new SmartPhone("Apple", "iPhone 13", 15, 128, true);
        SmartWatch appleWatch = new SmartWatch("Apple", " Watch series 7", 18, true, true);

        System.out.println("iPhone:");
        System.out.println("Brand: " + iPhone.getBrand());
        System.out.println("Model: " + iPhone.getModel());
        System.out.println("Battery life: " + iPhone.getBatteryLife() + " hours");
        System.out.println("Storage: " + iPhone.getStorage() + " GB");
        System.out.println("Has 5G: " + iPhone.isHas5G());

        System.out.println("Apple Watch:");
        System.out.println("Brand: " + appleWatch.getBrand());
        System.out.println("Model: " + appleWatch.getModel());
        System.out.println("Battery life: " + appleWatch.getBatteryLife() + " hours");
        System.out.println("Has heart rate sensor: " + appleWatch.isHasHeartRateSensor());
        System.out.println("Has GPS: " + appleWatch.isHasGPS());

    }
}
