package session1;

import java.util.Scanner;

class Bai_4{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double giaSach = sc.nextDouble();
        float tyGia = 25450.0f;
        double giaChinhXac = giaSach * tyGia;
        System.out.printf("Giá chính xác (số thực): %.3E%n", giaChinhXac);
        long giaLamTron = (long) giaChinhXac;
        System.out.println("Giá làm tròn để thanh toán (long): " + giaLamTron);
    }
}