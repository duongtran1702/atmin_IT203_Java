package atmin;

import java.util.Stack;

public class MedicationProcessChecker {
    static Stack<String> stack = new Stack<>();

    public void reset() {
        stack.clear();
    }

    public boolean checkProcess(String[] actions) {
        reset();
        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];
            if (action.equalsIgnoreCase("PUSH")) {
                stack.push("push");
            } else if (action.equalsIgnoreCase("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Sai quy trinh tai buoc " + (i + 1) + ": Khong the pop khi stack dang rong");
                    return false;
                }
                stack.pop();
            } else {
                System.out.println("Hành động không hợp lệ tại bước " + (i + 1));
                return false;
            }

        }
        if (stack.isEmpty()) {
            System.out.println("Quy trinh hoan tat!");
            return true;
        }
        System.out.println("Sai: Kết thúc ca trực nhưng vẫn còn "
                + stack.size() + " thuốc chưa hoàn tất.");
        return false;
    }

    public static void main(String[] args) {
        String[] actions1 = {"PUSH", "PUSH", "POP", "POP"};

        String[] actions2 = {"PUSH", "POP", "POP"};

        String[] actions3 = {"PUSH", "PUSH", "POP"};

        MedicationProcessChecker checker = new MedicationProcessChecker();
        checker.checkProcess(actions1);
        checker.checkProcess(actions2);
        checker.checkProcess(actions3);

    }
}
