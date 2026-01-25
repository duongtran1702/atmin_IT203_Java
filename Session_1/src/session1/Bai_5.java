package session1;

import java.util.Scanner;

class Bai_5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach (4 chu so): ");
        int maSach = sc.nextInt();
        int thousands = maSach / 1000;
        int hundreds = (maSach % 1000) / 100;
        int dozens = ((maSach % 1000) % 100) / 10;
        int units = maSach % 10;

        System.out.println("Chu so kiem tra ki vong: " + units);
        System.out.println("Ket qua kiem tra ma sach: " + (thousands + hundreds + dozens == units ? "Hop Le" : "Sai Ma"));
    }
}
