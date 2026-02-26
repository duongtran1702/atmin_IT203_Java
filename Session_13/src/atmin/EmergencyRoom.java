package atmin;

import java.util.LinkedList;

public class EmergencyRoom {
    static LinkedList<String> list = new LinkedList<>();

    public static void patientCheckIn(String name) {
        list.addLast(name);
    }

    public static void emergencyCheckIn(String name) {
        list.addFirst(name);
    }

    public static String treatPatient() {
        return list.poll();
    }

    public static void main(String[] args) {
        patientCheckIn("A");
        emergencyCheckIn("C");
        patientCheckIn("B");

        while (!list.isEmpty()) {
            System.out.println(treatPatient());
        }
    }

}
