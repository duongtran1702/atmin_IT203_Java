package session1;

import java.util.Scanner;

public class Bai_1 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        String bookID = input.nextLine();

        System.out.print("Nhap ten sach: ");
        String bookName = input.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int publishYear = Integer.parseInt(input.nextLine());

        System.out.print("Nhap gia sach: ");
        double price = Double.parseDouble(input.nextLine());

        System.out.print("Sach con hay khong? (1 = con, 0 = het): ");
        int isAvailable = Integer.parseInt(input.nextLine());

        LibraryManager book = new LibraryManager(bookID, bookName, publishYear, price, isAvailable == 1);

        System.out.println("\t\t\tTHONG TIN SACH\n");
        final int t_age = book.calAgeBook();
        book.showBook(t_age);
    }
}


