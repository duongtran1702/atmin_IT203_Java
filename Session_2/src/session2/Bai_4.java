package session2;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        do {
            System.out.print("Nhap ma ID sach moi (phai > 0): ");
            id = sc.nextInt();
            if (id <= 0) {
                System.out.println("Loi: ID phai la so duong. Moi nhap lai!");
            }
        } while (id <= 0);
        System.out.printf("Xac nhan: Ma sach %d da duoc ghi nhan.",id);
    }
}

