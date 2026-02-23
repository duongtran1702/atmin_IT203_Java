package atmin.b5;

public class Main {
    public static void main(String[] args) {

        Employee staff = new OfficeStaff("An", 8000);
        Employee manager = new Manager("Bình", 15000, 5000);

        System.out.println(staff.name + " - Lương: " + staff.calculateSalary());
        System.out.println(manager.name + " - Lương: " + manager.calculateSalary());
    }
}
