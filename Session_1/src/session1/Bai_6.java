package session1;

import java.util.Scanner;

class Bai_6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu tu cua sach trong he thong: ");
        int stt = sc.nextInt();
        int ke = (stt - 1) / 25 + 1;
        int idx = (stt - 1) % 25 + 1;
        System.out.println("--- THONG TIN DINH VI ---");
        System.out.println("Sach so: " + stt);
        System.out.printf("Dia chi: Ke %d - Vi tri %d%n", ke, idx);
        System.out.println("Phan khu: " + (ke <= 10 ? "Khu can (Gan cua)" : "Khu vien (Xa cua)"));

    }
}