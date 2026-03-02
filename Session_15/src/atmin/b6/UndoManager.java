package atmin.b6;

import java.util.Stack;

public class UndoManager {
    Stack<InputAction> undoStack = new Stack<>();
    static int maxUndoSteps =0 ;

    public void addAction(InputAction action) {
        maxUndoSteps++;
        undoStack.push(action);
    }

    public InputAction undo() {
        if (!undoStack.isEmpty()) {
            return undoStack.pop();
        }
        return null;
    }
}
