package HW.computers;

public class SmartPhone extends Laptop {
    private String os;
    private int cameraResolution;

    public SmartPhone(String cpu, int ram, int hdd, String brand, String display, int batteryCapacity, double weight, String os, int cameraResolution) {
        super(cpu, ram, hdd, brand, display, batteryCapacity, weight);
        this.os = os;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return super.toString() + " SmartPhone " +
                "os= " + os   +
                ", cameraResolution= " + cameraResolution ;
    }
}