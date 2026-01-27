package session2;

import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float sum = 0;
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            int num;
            if (i == 6) {
                System.out.print("Nhập lượt mượn ngày chủ nhật: ");
                num = sc.nextInt();
            } else {
                System.out.print("Nhập lượt mượn ngày thứ " + (i + 2) + " : ");
                num = sc.nextInt();
            }
            if (num == 0) {
                continue;
            }
            if (num > max) max = num;
            if (num < min) min = num;

            sum += num;
            cnt++;
        }

        System.out.println("---Kết quả thống kê---");
        System.out.println("Lượt mượn cao nhất: " + max);
        System.out.println("Lượt mượn thấp nhất: " + min);
        System.out.println("Trung binh lượt mượn trên ngày: " + sum / cnt);
    }
}
