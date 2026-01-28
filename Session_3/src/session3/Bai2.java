package session3;

import java.util.Scanner;

public class Bai2 {
    public static int searchBooks(String[] arr, String search){
        int idx =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equalsIgnoreCase(search)){
                idx =i;
                break;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        String[] books = {
                "Doraemon",
                "Tuổi Thơ Dữ Dội",
                "Harry Potter",
                "Nhà Giả Kim",
                "Đắc Nhân Tâm"
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach can tim: ");
        String name = sc.nextLine();
        int idx = searchBooks(books,name);
        if(idx==-1){
            System.out.print("Sach khong ton tai trong thu vien!");
        }
        else{
            System.out.printf("Tim thay sach %s tai vi tri: %d", name, idx);
        }
    }
}
