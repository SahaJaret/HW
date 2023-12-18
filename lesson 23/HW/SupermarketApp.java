

public class SupermarketApp {
    public static void main(String[] args) {
        Supermarket kiosk = new Supermarket(4);
        kiosk.addProduct(new Product(1000, "Gift card", 20));
        kiosk.addProduct(new Product(2000, "Sausages", 5));
        kiosk.addProduct(new Product(3000, "Goat cheese", 13));
        kiosk.printAllProducts();


        Product updatedProduct = kiosk.updateProduct(2000, 6);
        if (updatedProduct != null) {
            System.out.println("Обновленный продукт: " + updatedProduct);
        } else {
            System.out.println("Продукт не найден");
        }



        boolean isRemoved = kiosk.removeProduct(3000);
        if (isRemoved) {
            System.out.println("Продукт успешно удален");
        } else {
            System.out.println("Продукт не найден");
        }


        kiosk.printAllProducts();
    }
}
