package atmin;

import java.time.LocalDateTime;
import java.util.Stack;

public class MedicalRecordHistory {
    static Stack<EditAction> history = new Stack<>();

    void addHistory(EditAction editAction) {
        history.push(editAction);
    }

    EditAction undoEdit() {
        return history.pop();
    }

    EditAction getLastAction() {
        return history.peek();
    }

    boolean isEmpty() {
        return history.isEmpty();
    }

    void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("History is empty");
            return;
        }

        Stack<EditAction> historyCopy = new Stack<>();
        historyCopy.addAll(history);

        while (!historyCopy.isEmpty()) {
            EditAction editAction = historyCopy.pop();
            System.out.println(editAction);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        MedicalRecordHistory mr = new MedicalRecordHistory();
        mr.addHistory(new EditAction("Edit 1",
                LocalDateTime.of(2026, 3, 2, 8, 0)));

        mr.addHistory(new EditAction("Edit 2",
                LocalDateTime.of(2026, 3, 2, 9, 30)));

        mr.addHistory(new EditAction("Edit 3",
                LocalDateTime.of(2026, 3, 2, 10, 15)));

        mr.addHistory(new EditAction("Edit 4",
                LocalDateTime.of(2026, 3, 2, 11, 45)));

        mr.addHistory(new EditAction("Edit 5",
                LocalDateTime.of(2026, 3, 2, 14, 0)));

//        System.out.println(mr.undoEdit().description);
//        System.out.println(mr.getLastAction().description);
        mr.displayHistory();
        mr.displayHistory();

    }

}
