package session2;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Hệ thống đánh giá độc giả---");
        System.out.println("Nhập số ngày trễ. Nhập 999 để kết thúc");

        System.out.print("Số ngày trễ của lần này : ");
        int day = sc.nextInt();

        int diem = 100;

        while (day != 999) {
            if (day <= 0) {
                System.out.println("-> Trả đúng hạn/sớm (" + day + " ngày): +5 điểm");
                diem += 5;
            } else {
                System.out.println("-> Trả trễ " + day + " ngày: -" + (day * 2) + " điểm");
                diem -= (day * 2);
            }
            System.out.print("Số ngày trễ của lần này là: ");
            day = sc.nextInt();
        }

        System.out.println("Tổng điểm uy tin: " + diem);
        if (diem > 120) {
            System.out.println("Xếp loại: Độc giả thân thiết");
        } else if (diem >= 80) {
            System.out.println("Xếp loại: Độc giả tiêu chuẩn");
        } else {
            System.out.println("Xếp loại: Độc giả cần lưu ý");
        }
    }
}