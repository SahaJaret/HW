package HW.product;

public class ProductAppl {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product("Яблоко", 1234567890, 1.99),
                new Food("Хлеб", 2345678901L, 2.99, "2024-01-01"),
                new MeatFood("Курица", 3456789012L, 5.99, "2023-12-31", "курица"),
                new MilkFood("Молоко", 4567890123L, 3.49, "2023-12-15", "корова", 2.0)
        };

        printProducts(products);
        System.out.println("Сумма цен: " + calculateTotalPrice(products));
    }

    private static void printProducts(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static double calculateTotalPrice(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
