package HW.supermarket;



public class SupermarketAppl {
    public static void main(String[] args) {
        Supermarket kiosk = new Supermarket(4);
        kiosk.addProduct(new Product(1000, "Gift card", 20));
        kiosk.addProduct(new Food(2000, "Sausages", 5, "20.10.2023", false));
        kiosk.addProduct(new Food(3000, "Goat cheese", 13, "31.12.2023", true));
        kiosk.addProduct(new Food(4000, "Pork fat", 3, "15.11.2023", true));


        kiosk.printAllProducts();


        boolean removed = kiosk.removeProduct(2000);
        System.out.println("Товар удален: " + removed);

        System.out.println("Товары после удаления:");
        kiosk.printAllProducts();

        removed = kiosk.removeProduct(5000);
        System.out.println("Товар удален: " + removed);

        System.out.println("Товары после удаления:");
        kiosk.printAllProducts();
    }
}
