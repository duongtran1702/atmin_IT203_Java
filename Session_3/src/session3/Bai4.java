package session3;

import java.util.Arrays;

public class Bai4 {
    public static void sortBooks(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Khởi tạo mảng như trong ví dụ
        int[] books = {105, 102, 109, 101, 103};

        System.out.print("Trước khi sắp xếp: ");
        displayBooks(books);

        sortBooks(books);

        System.out.print("Sau khi sắp xếp:  ");
        displayBooks(books);
    }
}
