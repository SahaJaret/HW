public class Supermarket {
    private Product[] products;
    private int quantity;

    public Supermarket(int capacity) {
        products = new Product[capacity];
    }

    public boolean addProduct(Product product) {
        if (product == null || quantity == products.length || findProduct(product.getBarcode()) != null) {
            return false;
        }
        products[quantity++] = product;
        return true;
    }

    public Product findProduct(long barcode) {
        for (Product product : products) {
            if (product != null && product.getBarcode() == barcode) {
                return product;
            }
        }
        return null;
    }

    public Product updateProduct(long barcode, double price) {
        Product product = findProduct(barcode);
        if (product != null) {
            product.setPrice(price);
            return product;
        }
        return null;
    }

    public boolean removeProduct(long barCode) {
        for (int i = 0; i < quantity; i++) {
            if (products[i] != null && products[i].getBarcode() == barCode) {
                System.arraycopy(products, i + 1, products, i, quantity - i - 1);
                products[--quantity] = null;
                return true;
            }
        }
        return false;
    }

    public void printAllProducts() {
        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }

    public int getQuantity() {
        return quantity;
    }
}
