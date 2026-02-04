package atmin;

public class OfficeEmployee extends Employee {

    private double allowance;

    public OfficeEmployee(String name, double basicSalary, double allowance) {
        super(name, basicSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + allowance;
    }
}
