package atmin;

public class EmergencyPatient {
    String id;
    String name;
    int priority;

    EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Priority: " + priority;
    }
}
