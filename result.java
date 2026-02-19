import Ecommerce.Product;
import Ecommerce.Customer;
import Ecommerce.Order;

public class EcommerceSystem {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 50000);
        Customer c1 = new Customer(101, "Balaji");
        Order o1 = new Order(p1, c1, 2);

        o1.placeOrder();
    }
}
