public class ComputerAppl {
    public static void main(String[] args) {
        Computer[] shop = new Computer[5];
        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
        shop[0].setRam(24);
        shop[2] = new Laptop("i7", 24, 1024, "Asus", 3, 2.1);
        shop[3] = new Smartphone("i9", 32, 2048, "Apple", 5, 1.5, 123456789012345L);

        for (int i = 0; i < shop.length; i++) {
            if (shop[i] != null) {
                System.out.println(shop[i]);
            }
        }

        double totalBatteryHours = TotalBatteryHours(shop);
        System.out.println("Общее всремя работи всех батарей ноутбуков: " + totalBatteryHours);

        int totalSsdVolume = TotalSsdVolume(shop);
        System.out.println("Общая емкость Ssd: " + totalSsdVolume);
    }

    private static double TotalBatteryHours(Computer[] computers) {
        double totalHours = 0.0;
        for (Computer computer : computers) {
            if (computer instanceof Laptop) {
                totalHours += ((Laptop) computer).getHours();
            }
        }
        return totalHours;
    }

    private static int TotalSsdVolume(Computer[] computers) {
        int totalSsd = 0;
        for (Computer computer : computers) {
            if (computer instanceof Laptop && !(computer instanceof Smartphone)) {
                totalSsd += computer.getSsd();
            }
        }
        return totalSsd;
    }
}
