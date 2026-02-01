package atmin;

public class Book {
    private final String bookId;
    private final String bookName;
    private final double price;

    public Book(String bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public void showBook() {
        System.out.println("--- PHIẾU THÔNG TIN SÁCH ---");
        System.out.println("Tên sách: " + bookName);
        System.out.println("Mã số: " + bookId);
        System.out.printf("Giá bán: %.2f VNĐ\n", price);

    }

    public static void main(String[] args) {
        Book b = new Book("1", "Hello world", 10.0);
        b.showBook();
    }

}
