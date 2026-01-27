package session3;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static int[] addBookToLibraries(int n) {
        int[] bookIds = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma so %d cuon sach: %n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Sach thu %d: ", i + 1);
            bookIds[i] = sc.nextInt();
        }
        return bookIds;
    }

    static void displayLibraries(int[] arr) {
        System.out.println("--- Ket Qua ---");
        System.out.print("Danh sach ma sach: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhap so luong sach can quan ly: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = addBookToLibraries(n);
        displayLibraries(arr);
    }
}
