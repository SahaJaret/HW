public class Smartphone extends Laptop {
    private long imei;

    public Smartphone(String cpu, int ram, int ssd, String brand, double hours, double weight, long imei) {
        super(cpu, ram, ssd, brand, hours, weight);
        this.imei = imei;
    }

    @Override
    public String toString() {
        return super.toString() + ", IMEI: " + imei;
    }
}