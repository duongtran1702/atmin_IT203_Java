package session2;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        char c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma khu vuc (A,B,C,D): ");
        c = sc.next().charAt(0);

        switch (c){
            case 'A':
                System.out.println("Vi tri: Tang 1 - Sach Van hoc");
                break;
            case 'B':
                System.out.println("Vi tri: Tang 2 - Sach Khoa hoc");
                break;
            case 'C':
                System.out.println("Vi tri: Tang 1 - Sach Ngoai ngu");
                break;
            case 'D':
                System.out.println("Vi tri: Tang 1 - Sach tin hoc");
                break;
            default:
                System.out.println("Ma khu vuc khong hop le!");
                break;
        }
    }
}
