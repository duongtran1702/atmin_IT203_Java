package atmin;

public class Patient {
    String id;
    String name;
    int age;

    public Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
}
