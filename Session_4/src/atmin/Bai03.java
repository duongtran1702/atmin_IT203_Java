package atmin;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bai03 {
    public static void main(String[] args) {
        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = today.format(formatter);

        //C1
        long startSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        sb.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        sb.append("Ngày tạo: ").append(date).append("\n");
        for (String transaction : transactions) {
            sb.append("Giao dịch: ").append(transaction).append("\n");
        }
        String result = sb.toString();
        long endSB = System.nanoTime();

        //C2
        long startStr = System.nanoTime();
        String str ="--- BÁO CÁO MƯỢN SÁCH ---\n";
        str += "Ngày tạo: " + date + "\n";
        for (String transaction : transactions) {
            str += "Giao dịch: " + transaction + "\n";
        }
        long endStr = System.nanoTime();

        System.out.println(result);
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + (endSB - startSB));
        System.out.println("Số thời gian thực thi đối với String (+): " + (endStr - startStr));
    }
}
