package atmin;

public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Double salary;

    public Employee() {}

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public Employee(int employeeId,String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void show(){
        System.out.println("Employee Id: " + this.employeeId);
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Salary: " + this.salary);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Employee e1 =new Employee();
        Employee e2 =new Employee(1,"atmin");
        Employee e3 =new Employee(2,"mynato",100.0);

        e1.show();
        e2.show();
        e3.show();
    }
}
