package atmin;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class EmergencyQueue {
    static Queue<EmergencyPatient> q = new PriorityQueue<>((q1, q2) -> q1.priority - q2.priority);

    public void addPatient(EmergencyPatient p) {
        q.add(p);
    }

    EmergencyPatient callNextPatient() {
        return q.poll();
    }

    void displayQueue() {
        Queue<EmergencyPatient> temp = new PriorityQueue<>((q1, q2) -> q1.priority - q2.priority);
        temp.addAll(q);

        while (!temp.isEmpty()) {
            EmergencyPatient p = temp.poll();
            System.out.println(p);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        EmergencyQueue e = new EmergencyQueue();
        e.addPatient(new EmergencyPatient("1", "Patient A", 1));
        e.addPatient(new EmergencyPatient("2", "Patient B", 2));
        e.addPatient(new EmergencyPatient("3", "Patient C", 1));
        e.addPatient(new EmergencyPatient("4", "Patient D", 1));
        e.addPatient(new EmergencyPatient("5", "Patient E", 2));

        e.displayQueue();
        System.out.println("Current Patient: " + e.callNextPatient().name+"\n");
        e.displayQueue();
    }

}
