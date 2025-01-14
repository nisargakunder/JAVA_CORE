package Q4;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
class SortByProductPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}

    public class ProductTest {
        public static void main(String[] args) {
            Product p1 = new Product("123", "Laptop", 50000);
            Product p2 = new Product("837", "Mobile", 20000);
            Product p3 = new Product("824", "Tablet", 30000);
            Product p4 = new Product("1235", "Camera", 40000);
            Product p5 = new Product("9836", "Headphone", 50000);
            PriorityQueue<Product> products = new PriorityQueue<>(new SortByProductPrice());

            products.add(p1);
            products.add(p2);
            products.add(p3);
            products.add(p4);
            products.add(p5);
            while (!products.isEmpty()) {
                System.out.println(products.poll());
            }

        }

    }
