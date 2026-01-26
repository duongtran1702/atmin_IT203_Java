package session2;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        int bookBorrow;
        System.out.print("Nhap tuoi cua ban: ");
        age = sc.nextInt();
        System.out.print("Nhap so sach dang muon: ");
        bookBorrow = sc.nextInt();
        if (age >= 18 && bookBorrow <= 2) {
            System.out.println("Cho phép mượn sách");
        } else if (age < 18)
            System.out.println("Ket qua: Khong du dieu kien.\n- Ly do: Bạn chưa đủ tuổi");
        else
            System.out.println("Ket qua: Khong du dieu kien.\n- Ly do:Bạn đã mượn quá số lượng cho phép");
    }
}
