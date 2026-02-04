package atmin;

public class Person {
    protected String fullName;
    protected int age;

    // Constructor
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Phương thức hiển thị
    public void display() {
        System.out.println("Họ tên: " + fullName);
        System.out.println("Tuổi: " + age);
    }
}


