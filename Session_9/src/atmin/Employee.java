package atmin;

public class Employee {
    protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary(){
        return basicSalary;
    };
}

