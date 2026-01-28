package atmin;

import java.util.regex.Pattern;

public class Bai04 {
    public static String validateCard(String cardID) {

        if (cardID == null || cardID.length() != 11) {
            return "Lỗi: Mã thẻ phải có đúng 11 ký tự.";
        }

        String prefix = cardID.substring(0, 2);
        if (!Pattern.matches("^[A-Z]{2}$", prefix)) {
            return "Lỗi: Thiếu tiền tố (phải là 2 chữ cái viết hoa).";
        }

        if (!prefix.equals("TV")) {
            return "Lỗi: Thiếu tiền tố TV.";
        }

        String yearPart = cardID.substring(2, 6);
        if (!Pattern.matches("^\\d{4}$", yearPart)) {
            return "Lỗi: Năm không hợp lệ.";
        }

        String suffixPart = cardID.substring(6);
        if (!Pattern.matches("^\\d{5}$", suffixPart)) {
            return "Lỗi: Định dạng 5 số cuối không đúng.";
        }

        return "Mã thẻ hợp lệ!";
    }

    public static void main(String[] args) {
        // Các trường hợp kiểm thử
        String[] testCards = {
                "TV202312345",
                "AB202312345",
                "tv202312345",
                "TV202X12345",
                "TV2023123"
        };

        for (String card : testCards) {
            System.out.println(card + " => " + validateCard(card));
        }
    }
}
