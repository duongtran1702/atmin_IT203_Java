package admin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("T01", "Paracetamol");
        map.put("T02", "Ibuprofen");
        map.put("T03", "Aspirin");
        map.put("T04", "Amoxicillin");
        map.put("T05", "Vitamin C");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào mã thuốc: ");
        String tmp = sc.nextLine();
        if (map.containsKey(tmp)) {
            System.out.println("Tên thuốc: "+ map.get(tmp));
        }
        else System.out.println("Thuốc không tồn tại!!");
    }
}
