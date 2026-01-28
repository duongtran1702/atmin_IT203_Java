package atmin;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai05 {
    public static void main(String[] args) {
        // Dữ liệu đầu vào
        String logLine = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345";

        // Regex với 4 Capturing Groups
        String regex = "^(\\d{4}-\\d{2}-\\d{2})\\s\\|\\sUser:\\s(\\w+)\\s\\|\\sAction:\\s(BORROW|RETURN)\\s\\|\\sBookID:\\s(\\w+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(logLine);

        // Khởi tạo mảng String có 4 phần tử để lưu trữ
        String[] extractedData = new String[4];
        int borrowCount = 0;
        int returnCount = 0;

        if (matcher.find()) {
            extractedData[0] = matcher.group(1);
            extractedData[1] = matcher.group(2);
            extractedData[2] = matcher.group(3);
            extractedData[3] = matcher.group(4);

            // Hiển thị kết quả từ mảng
            System.out.println("Dữ liệu trong mảng:");
            System.out.println("- Ngày: " + extractedData[0]);
            System.out.println("- Người dùng: " + extractedData[1]);
            System.out.println("- Hành động: " + extractedData[2]);
            System.out.println("- Mã sách: " + extractedData[3]);

            if ("BORROW".equals(extractedData[2])) {
                borrowCount++;
            } else if ("RETURN".equals(extractedData[2])) {
                returnCount++;
            }
        }

        System.out.println("\nThống kê:");
        System.out.println("BORROW: " + borrowCount);
        System.out.println("RETURN: " + returnCount);
    }
}
