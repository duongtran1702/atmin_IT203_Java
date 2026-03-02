package atmin;

import java.util.Stack;

public class EmergencyCase {
    Patient patient;
    Stack<TreatmentStep> steps = new Stack<>();

    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }

    void addStep(TreatmentStep step) {
        steps.push(step);
    }

    TreatmentStep undoStep() {
        return steps.pop();
    }

    void displaySteps() {
        Stack<TreatmentStep> temp = new Stack<>();
        temp.addAll(steps);
        while (!temp.isEmpty()) {
            TreatmentStep step = temp.pop();
            System.out.println(step);
        }
        System.out.println();
    }
}
