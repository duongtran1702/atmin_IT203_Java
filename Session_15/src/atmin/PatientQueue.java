package atmin;

import java.util.ArrayDeque;
import java.util.Queue;

public class PatientQueue {
    static Queue<Patient> queue = new ArrayDeque<>();

    void addPatient(Patient p) {
        queue.add(p);
    }

    Patient callNextPatient() {
        if (!queue.isEmpty()) {
            return queue.poll();
        }
        return null;

    }

    Patient peekNextPatient() {
        if (!queue.isEmpty()) {
            return queue.peek();
        }

        return null;
    }

    boolean isEmpty() {
        return queue.isEmpty();
    }

    void displayQueue() {
        for (Patient p : queue) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        PatientQueue pq = new PatientQueue();

        // Thêm 5 bệnh nhân
        pq.addPatient(new Patient("P01", "Nguyen Van A", 60));
        pq.addPatient(new Patient("P02", "Tran Thi B", 45));
        pq.addPatient(new Patient("P03", "Le Van C", 30));
        pq.addPatient(new Patient("P04", "Pham Thi D", 25));
        pq.addPatient(new Patient("P05", "Hoang Van E", 50));

        System.out.println("=== Danh sach hien tai ===");
        pq.displayQueue();

        System.out.println("\n=== Goi benh nhan tiep theo ===");
        Patient called = pq.callNextPatient();
        if (called != null) {
            System.out.println(called);
        } else
            System.out.println("Patient Queue is Empty");

        System.out.println("\n=== Xem benh nhan sap toi (peek) ===");
        Patient temp = pq.peekNextPatient();
        if (temp != null) {
            System.out.println(temp);
        } else
            System.out.println("Patient Queue is Empty");

        System.out.println("\n=== Trang thai hang doi ===");
        System.out.println("Is empty: " + pq.isEmpty());
    }
}
