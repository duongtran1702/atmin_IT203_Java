package atmin;

public class Product {
    private int productId;
    private String productName;
    private double price;

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        if(price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        this.price = price;
    }

    public Product(int productId, String productName,double price ) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public void show(){
        System.out.println("Product ID: " + productId + "\nProduct Name: " + productName + "\nPrice: " + price);
    }

    public static void main(String[] args) {
        Product p = new Product(1,"ABC",123);
        p.show();
        p.setPrice(-120);
    }

}

