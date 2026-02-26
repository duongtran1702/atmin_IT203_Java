package atmin;

public class Patient {
    private static int autoId = 1;
    private final String id;
    private final String fullName;
    private final int age;
    private String diagnosis;

    public Patient(String fullName, int age, String diagnosis) {
        this.id = "P00" + autoId++;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}