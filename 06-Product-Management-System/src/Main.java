import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();

        List<Product> products = service.getProducts();

        // 1. All products available in the database
        System.out.println("\n\n-------------All PRODUCTS-------------");
        products.forEach(System.out::println);

        // 2. Predicate
        System.out.println("\n\n-------------PRODUCTS ABOVE ₹10,000-------------");
        Predicate<Product> expensiveProduct = product -> product.getPrice() >= 10000;

        for (Product product : products) {
            if (expensiveProduct.test(product)) {
                System.out.println(product);
            }
        }

        // 3. Products Electronics
        System.out.println("\n\n-------------PRODUCTS ELECTRONICS-------------");
        Predicate<Product> electronicsProduct = product -> product.getCategory().equals("Electronics");

        for (Product product : products) {
            if (electronicsProduct.test(product)) {
                System.out.println(product);
            }
        }

        // ==================================================
        // 3. Predicate - Low Stock
        // ==================================================

        System.out.println("\n========== LOW STOCK PRODUCTS ==========");

        Predicate<Product> lowStock = product -> product.getQuantity() < 5;

        for (Product product : products) {

            if (lowStock.test(product)) {
                System.out.println(product);
            }
        }

        // ==================================================
        // 4. Combining Predicates
        // ==================================================

        // System.out.println("\n========== ELECTRONICS ABOVE ₹20,000 ==========");

        // Predicate<Product> expensiveElectronics = electronics.and(
        // product -> product.getPrice() > 20000);

        // for (Product product : products) {

        // if (expensiveElectronics.test(product)) {
        // System.out.println(product);
        // }
        // }

        // ==================================================
        // 5. Consumer
        // ==================================================

        System.out.println("\n========== PRODUCT NAMES ==========");

        Consumer<Product> printProductName = product -> System.out.println(product.getName());

        for (Product product : products) {

            printProductName.accept(product);
        }

        // ==================================================
        // 6. Consumer - Display Product Details
        // ==================================================

        System.out.println("\n========== PRODUCT DETAILS ==========");

        Consumer<Product> displayProduct = product -> System.out.println(
                product.getName()
                        + " -> ₹"
                        + product.getPrice());

        for (Product product : products) {

            displayProduct.accept(product);
        }

        // ==================================================
        // 7. Function
        // ==================================================

        System.out.println("\n========== PRODUCT PRICES ==========");

        Function<Product, Double> getProductPrice = product -> product.getPrice();

        for (Product product : products) {

            System.out.println(
                    product.getName()
                            + " -> ₹"
                            + getProductPrice.apply(product));
        }

        // ==================================================
        // 8. Function - Product Name
        // ==================================================

        System.out.println("\n========== PRODUCT NAME LENGTH ==========");

        Function<Product, Integer> getNameLength = product -> product.getName().length();

        for (Product product : products) {

            System.out.println(
                    product.getName()
                            + " -> "
                            + getNameLength.apply(product));
        }

        // ==================================================
        // 9. Function - Calculate Discounted Price
        // ==================================================

        System.out.println("\n========== DISCOUNTED PRICES ==========");

        Function<Product, Double> discountedPrice = product -> product.getPrice() * 0.90;

        for (Product product : products) {

            System.out.println(
                    product.getName()
                            + " -> ₹"
                            + discountedPrice.apply(product));
        }

        // ==================================================
        // 10. Supplier
        // ==================================================

        System.out.println("\n========== SUPPLIER ==========");

        Supplier<String> companyName = () -> "Asritha Electronics";

        System.out.println(
                "Company: " + companyName.get());

        // ==================================================
        // 11. Supplier - Generate Product ID
        // ==================================================

        Supplier<Integer> productId = () -> 999;

        System.out.println(
                "Generated Product ID: "
                        + productId.get());
    }
}