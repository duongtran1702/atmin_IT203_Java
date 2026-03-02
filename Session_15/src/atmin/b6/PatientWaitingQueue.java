package atmin.b6;

import java.util.ArrayDeque;
import java.util.Queue;

public class PatientWaitingQueue {
    Queue<Patient> waitingQueue = new ArrayDeque<>();
    static int totalPatients = 0;


    public void addPatient(Patient p) {
        totalPatients++;
        waitingQueue.add(p);
    }

    public Patient getNextPatient() {
        return waitingQueue.poll();
    }
}
