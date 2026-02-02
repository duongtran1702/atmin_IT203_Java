package atmin;

public class Student {
    private String stuName;
    private final Integer stuId;
    static int totalStudent =0;

    public Student(String stuName) {
        this.stuName = stuName;
        this.stuId = ++totalStudent;
    }

    public void show(){
        System.out.println("ID: " + stuId +" - "+stuName);
        System.out.println("------------------------");
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuName() {
        return stuName;
    }


    public static void main(String[] args) {
        Student s1 = new Student("Jack");
        Student s2 = new Student("Jack");
        s1.show();
        s2.show();
        System.out.println("Total student: "+totalStudent);
    }
}
