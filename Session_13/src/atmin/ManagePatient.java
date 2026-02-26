package atmin;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ManagePatient {
    static Scanner input = new Scanner(System.in);
    public static void menu() {
        System.out.println("||===================================================================||");
        System.out.printf("||%30sMENU%33s||\n", "", "");
        System.out.println("||===================================================================||");

        System.out.printf("||\t\t\t %-55s ||\n", "1. Tiếp nhận bệnh nhân");
        System.out.printf("||\t\t\t %-55s ||\n", "2. Cập nhật chẩn đoán");
        System.out.printf("||\t\t\t %-55s ||\n", "3. Xuất viện");
        System.out.printf("||\t\t\t %-55s ||\n", "4. Sắp xếp danh sách bệnh nhân");
        System.out.printf("||\t\t\t %-55s ||\n", "5. Hiển thị danh sách bệnh nhân");
        System.out.printf("||\t\t\t %-55s ||\n", "6. Thoát");

        System.out.println("||===================================================================||");
    }

    public static Patient receivePatient() {
        System.out.print("Nhập tên bệnh nhân: ");
        String fullName = input.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Nhập chẩn đoán: ");
        String diagnosis = input.nextLine();
        System.out.println("Bệnh nhân được thêm thành công.");
        return new Patient(fullName, age, diagnosis);
    }

    public static void updateDiagnosis(List<Patient> list, String id) {
        int existed = 0;
        for (Patient patient : list) {
            if (patient.getId().equalsIgnoreCase(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                patient.setDiagnosis(input.nextLine());
                existed = 1;
                break;
            }
        }
        if (existed > 0) {
            System.out.println("Chẩn đoán đã được cập nhật.");
        } else System.out.println("Bệnh nhân không tồn tại.");

    }

    public static void dischargedFromHospital(List<Patient> list, String id) {
        ListIterator<Patient> it = list.listIterator();
        boolean existed = false;

        while (it.hasNext()) {
            Patient patient = it.next();
            if (patient.getId().equalsIgnoreCase(id)) {
                it.remove();
                existed = true;
                break;
            }
        }

        if (existed) {
            System.out.println("Đã xuất viện cho bệnh nhân " + id);
        } else {
            System.out.println("Bệnh nhân không tồn tại.");
        }
    }

    public static void sortListPatients(List<Patient> list) {
        list.sort((p1, p2) -> {
            if (p1.getAge() != p2.getAge()) {
                return p1.getAge() - p2.getAge();
            }
            return p1.getFullName().compareToIgnoreCase(p2.getFullName());
        });

        System.out.println("Đã sắp xếp danh sách bệnh nhân.");
    }

    public static void display(List<Patient> list) {
        System.out.println("==================== Danh sách bệnh nhân ====================");

        for (Patient p : list) {
            System.out.printf("| ID: %-6s | FullName: %-20s | Age: %-3d | Diagnosis: %-20s |\n",
                    p.getId(),
                    p.getFullName(),
                    p.getAge(),
                    p.getDiagnosis());
        }
        System.out.println("==============================================================");
    }

    public static void main(String[] args) {
        int choice;
        List<Patient> patients = new ArrayList<>();

        do {
            menu();
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    patients.add(receivePatient());
                    break;

                case 2:
                    System.out.print("Nhập ID bệnh nhân cần cập nhật: ");
                    updateDiagnosis(patients, input.nextLine());
                    break;

                case 3:
                    System.out.print("Nhập ID bệnh nhân cần xuất viện: ");
                    dischargedFromHospital(patients, input.nextLine());
                    break;

                case 4:
                    sortListPatients(patients);
                    break;

                case 5:
                    display(patients);
                    break;

                case 6:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);
    }
}
