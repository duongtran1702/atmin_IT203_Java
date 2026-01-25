package session1;

// n: so ngay tre
// m: so sach dang muon

import java.util.Scanner;

class Bai_2 {

    static void main() {
        int n;
        int m;
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhập số ngày chậm trễ: ");
        n = ip.nextInt();
        System.out.print("Nhập số lượng sách mượn: ");
        m = ip.nextInt();
        double total = n * m * 5000;
        System.out.printf("Tiền phạt gốc: %.1f VNĐ\n",total);
        if (n>7 && m>=3){
            total = n * m * 5000 * 1.2;
        }
        System.out.printf("Tiền phạt sau điều chỉnh: %.1f VNĐ\n",total);
        System.out.println("Yêu cầu khóa thẻ: " + (total > 50000? "true":"false"));
    }
}
