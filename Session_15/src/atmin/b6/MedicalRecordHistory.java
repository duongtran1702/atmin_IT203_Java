package atmin.b6;

import java.util.Stack;

public class MedicalRecordHistory {
    Stack<EditAction> editStack = new Stack<>();
    String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditAction action) {
        editStack.push(action);
    }

    public void displayHistory() {
        Stack<EditAction> temp = new Stack<>();
        temp.addAll(editStack);

        while (!temp.isEmpty()) {
            EditAction action = temp.pop();
            System.out.println(action);
        }

    }

    public void undoEdit() {
        editStack.pop();
    }
}
