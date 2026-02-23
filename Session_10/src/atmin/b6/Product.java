package atmin.b6;

import java.util.Arrays;
import java.util.Comparator;


public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product("Laptop", 2000),
                new Product("Phone", 1000),
                new Product("Tablet", 1500)
        };

        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("Sắp xếp theo giá tăng dần:");
        for (Product p : products) {
            System.out.println(p);
        }

        Arrays.sort(products, (p1, p2) -> p1.name.compareTo(p2.name));

        System.out.println("\nSắp xếp theo tên A-Z:");
        for (Product p : products) {
            System.out.println(p);
        }

        // Anonymous Class bắt buộc dùng khi:
        // - Cần thêm thuộc tính nội bộ (ví dụ: biến đếm số lần so sánh)
        // - Interface có nhiều hơn 1 abstract method
        // Lambda chỉ dùng được khi interface là Functional Interface (1 abstract method)
    }
}
