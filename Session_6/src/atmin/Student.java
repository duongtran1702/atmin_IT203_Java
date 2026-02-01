package atmin;

public class Student {
    private static int autoId = 1000;
    private final int id;
    private final String fullName;
    private final int yearOfBirth;
    private final double avgScore;

    public Student(String fullName, int yearOfBirth, double avgScore) {
        this.id = autoId++;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.avgScore = avgScore;
    }

    public void showInfor() {
        System.out.println("Student ID: " + id);
        System.out.println("Full name: " + fullName);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Avg Score: " + avgScore);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student("An", 2002, 8.5);
        Student s2 = new Student("Binh", 2001, 7.0);

        s1.showInfor();
        s2.showInfor();
    }
}
