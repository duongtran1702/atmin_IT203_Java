package atmin.b6;

public class Main {

    public static void main(String[] args) {

        // ==============================
        // BỆNH NHÂN CHỜ KHÁM
        // ==============================

        System.out.println("===== BENH NHAN CHO KHAM =====");

        PatientWaitingQueue waitingQueue = new PatientWaitingQueue();

        waitingQueue.addPatient(new Patient(1, "Nguyen Van A", 30, 0));
        waitingQueue.addPatient(new Patient(2, "Tran Thi B", 25, 1));
        waitingQueue.addPatient(new Patient(3, "Le Van C", 40, 0));

        System.out.println("Benh nhan duoc goi kham: " + waitingQueue.getNextPatient().name);
        System.out.println("So benh nhan con lai: " + PatientWaitingQueue.totalPatients);



        // ==============================
        //LỊCH SỬ CHỈNH SỬA BỆNH ÁN
        // ==============================

        System.out.println("\n===== LICH SU CHINH SUA BENH AN =====");

        MedicalRecordHistory history = new MedicalRecordHistory("MR01");

        history.addEdit(new EditAction("Cap nhat chan doan", "Dr. An", "09:00"));
        history.addEdit(new EditAction("Them ket qua xet nghiem", "Dr. Binh", "09:10"));
        history.addEdit(new EditAction("Chinh sua don thuoc", "Dr. An", "09:20"));

        System.out.println("Lich su hien tai:");
        history.displayHistory();

        System.out.println("\nHoan tac buoc gan nhat:");
        history.undoEdit();

        System.out.println("Sau khi hoan tac:");
        history.displayHistory();



        // ==============================
        // HỆ THỐNG GỌI SỐ
        // ==============================

        System.out.println("\n===== HE THONG GOI SO =====");

        TicketSystem ticketSystem = new TicketSystem();

        ticketSystem.issueTicket();
        ticketSystem.issueTicket();
        ticketSystem.issueTicket();

        System.out.println("Dang goi so: " + ticketSystem.callNextTicket().ticketNumber);
        System.out.println("Dang goi so: " + ticketSystem.callNextTicket().ticketNumber);



        // ==============================
        // UNDO THAO TÁC NHẬP LIỆU
        // ==============================

        System.out.println("\n===== UNDO NHAP LIEU =====");

        UndoManager undoManager = new UndoManager();

        undoManager.addAction(new InputAction("Name", "Nguyen A", "Nguyen Van A", "10:00"));
        undoManager.addAction(new InputAction("Age", "29", "30", "10:02"));
        undoManager.addAction(new InputAction("Address", "Ha Noi", "HCM", "10:05"));

        System.out.println("Hoan tac:");
        InputAction action1 = undoManager.undo();
        if (action1 != null) {
            System.out.println("Da hoan tac truong: " + action1.fieldName);
        }

        System.out.println("Hoan tac tiep:");
        InputAction action2 = undoManager.undo();
        if (action2 != null) {
            System.out.println("Da hoan tac truong: " + action2.fieldName);
        }
    }
}
