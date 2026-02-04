package atmin;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double basicSalary, String department) {
        super(name, basicSalary); // gọi constructor lớp cha
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager("Nguyen Van A", 15000000, "IT");
        m.displayInfo();
    }
}

