package atmin;

import java.util.ArrayDeque;
import java.util.Queue;

public class EmergencyCaseQueue {
    Queue<EmergencyCase> cases = new ArrayDeque<>();

    void addCase(EmergencyCase c) {
        cases.add(c);
    }

    EmergencyCase getNextCase() {
        return cases.poll();
    }

    public static void main(String[] args) {

        // Tạo hàng đợi cấp cứu
        EmergencyCaseQueue caseQueue = new EmergencyCaseQueue();

        // Tạo bệnh nhân
        Patient p1 = new Patient("1", "Nguyen Van A",20);
        Patient p2 = new Patient("2", "Tran Thi B",20);

        // Tạo hồ sơ cấp cứu
        EmergencyCase case1 = new EmergencyCase(p1);
        EmergencyCase case2 = new EmergencyCase(p2);

        // Thêm vào queue
        caseQueue.addCase(case1);
        caseQueue.addCase(case2);

        // Lấy ca đầu tiên ra xử lý
        EmergencyCase currentCase = caseQueue.getNextCase();
        System.out.println("Dang xu ly benh nhan: " + currentCase.patient.name);

        // Thêm các bước xử lý
        currentCase.addStep(new TreatmentStep("Tiep nhan", "08:00"));
        currentCase.addStep(new TreatmentStep("Chan doan", "08:05"));
        currentCase.addStep(new TreatmentStep("Dieu tri", "08:15"));

        // Hiển thị các bước
        System.out.println("\nDanh sach buoc xu ly:");
        currentCase.displaySteps();

        // Undo bước gần nhất
        System.out.println("\nHoan tac buoc gan nhat:");
        TreatmentStep undone = currentCase.undoStep();
        if (undone != null) {
            System.out.println("Da hoan tac: " + undone.description);
        }

        // Hiển thị lại sau khi undo
        System.out.println("\nSau khi hoan tac:");
        currentCase.displaySteps();

        // Xử lý tiếp bệnh nhân thứ hai
        EmergencyCase nextCase = caseQueue.getNextCase();
        System.out.println("\nDang xu ly benh nhan: " + nextCase.patient.name);
    }

}
