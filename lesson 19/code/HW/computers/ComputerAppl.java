package HW.computers;

public class ComputerAppl {
    public static void main(String[] args) {
        Computer[] comp = new Computer[5];
        comp[0] = new Computer("i9", 16, 512, "Asus");
        comp[1] = new Laptop("i5", 8, 256, "Acer", "14", 1000, 2);
        comp[2] = new Laptop("M2", 16, 512, "MacBook", "14", 5000, 1.6);
        comp[3] = new SmartPhone("Snapdragon 888", 8, 128, "Samsung", "6.2", 3000, 0.2, "Android", 108);
        comp[4] = new SmartPhone("A14 Bionic", 6, 256, "Apple", "5.4", 2800, 0.15, "iOS", 12);

        for (Computer c : comp) {
            System.out.println(c);
        }

        int sumHdd = 0;
        for (Computer c : comp) {
            sumHdd += c.getHdd();
        }

        System.out.println("Сумма HDD = " + sumHdd);
    }
}

