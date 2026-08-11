import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(
                new Product(101, "Laptop", 65000, "Electronics", 5));

        products.add(
                new Product(102, "Mobile", 30000, "Electronics", 10));

        products.add(
                new Product(103, "Headphones", 2500, "Accessories", 20));

        products.add(
                new Product(104, "Keyboard", 1500, "Accessories", 15));

        products.add(
                new Product(105, "Monitor", 18000, "Electronics", 7));

        products.add(
                new Product(106, "Chair", 8000, "Furniture", 4));

        products.add(
                new Product(107, "Desk", 12000, "Furniture", 3));

        products.add(
                new Product(108, "Mouse", 1000, "Accessories", 25));
    }

    public List<Product> getProducts() {
        return products;
    }
}
