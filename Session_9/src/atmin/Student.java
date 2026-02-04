package atmin;

public class Student extends Person {
    private String studentId;
    private double gpa;

    // Constructor
    public Student(String fullName, int age, String studentId, double gpa) {
        super(fullName, age); // gọi constructor lớp cha
        this.studentId = studentId;
        this.gpa = gpa;
    }

    // Ghi đè phương thức display
    @Override
    public void display() {
        super.display(); // hiển thị thông tin Person
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + gpa);
    }

    public static void main(String[] args) {
        Student st = new Student("Trần Văn A", 20, "SV001", 3.45);
        st.display();
    }
}

