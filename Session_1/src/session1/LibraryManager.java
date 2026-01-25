package session1;

public class LibraryManager {
    private String bookId;
    private String bookName;
    private int publishYear;
    private double price;
    private boolean isAvailable;

    public LibraryManager(String bookId, String bookName, int publishYear, double price, boolean isAvailable) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.publishYear = publishYear;
        this.price = price;
        this.isAvailable =  isAvailable;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void showBook(int t_age) {
        System.out.println("--- PHIẾU THÔNG TIN SÁCH ---");
        System.out.println("Tên sách: " + bookName);
        System.out.println("Mã số: " + bookId + " | Tuổi thọ: " + t_age + " năm");
        System.out.printf("Giá bán: %.2f VNĐ\n", price);
        System.out.println("Tình trạng: " + (isAvailable ? "Còn sách" : "Hết sách"));
    }

    public int calAgeBook(){
        return 2026 -  publishYear;
    }
}