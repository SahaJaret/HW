package HW.product;

public class Product {
    private String name;
    private long barCode;
    private double price;

    public Product(String name, long barCode, double price) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getBarCode() {
        return barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product  name= " + name + ", barCode= " + barCode + ", price= " + price;
    }
}