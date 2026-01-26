package session2;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach tra muon: ");
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("Nhap so ngay tre cua cuon thu %d: ",i);
            int temp = sc.nextInt();
            total += temp;
        }
        System.out.println("===> Tong tien phat: "+5000*total+" VND");
    }
}
