package atmin;

public class Bai02 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";
        int idx = description.indexOf("Kệ");
        String temp = description.substring(idx+4);
        String pos = temp.substring(0,temp.indexOf(","));
        System.out.printf("Vị trí tìm thấy: %s\n",pos);
        System.out.printf("Mô tả mới: Sách giáo khoa Toán lớp 12, Vị trí lưu trữ: %s.\n",temp);
    }


}
