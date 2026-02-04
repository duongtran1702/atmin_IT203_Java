package atmin;

public class ProductionEmployee extends Employee {

    private int productCount;
    private double salaryPerProduct;

    public ProductionEmployee(String name, double basicSalary,
                              int productCount, double salaryPerProduct) {
        super(name, basicSalary);
        this.productCount = productCount;
        this.salaryPerProduct = salaryPerProduct;
    }

    @Override
    public double calculateSalary() {
        return productCount * salaryPerProduct;
    }

    public static void main(String[] args) {
        Employee e1 = new OfficeEmployee("An", 8000000, 2000000);
        Employee e2 = new ProductionEmployee("Binh", 0, 100, 50000);

        System.out.println(e1.calculateSalary()); // OfficeEmployee
        System.out.println(e2.calculateSalary()); // ProductionEmployee

    }
}
