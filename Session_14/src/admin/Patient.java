package admin;

public class Patient {
    String name;
    int severity;
    int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {

        int hour = arrivalTime / 100;
        int minute = arrivalTime % 100;

        return name + " (Mức " + severity +
                ", đến lúc " + String.format("%d:%02d", hour, minute) + ")";
    }
}
