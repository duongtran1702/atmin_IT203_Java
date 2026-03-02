package atmin.b6;

public class Patient {
    int id;
    String name;
    int age;
    int gender;
    // 0 - Male 1 - Female

    public Patient(int id, String name, int age, int gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Patient: id=" + id + ", name=" + name + ", age=" + age + ", gender=" + (gender == 0 ? "Nam" : "Nu");
    }
}
