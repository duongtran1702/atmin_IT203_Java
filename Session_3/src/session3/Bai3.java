package session3;

public class Bai3 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities){
        int maxQuantity = quantities[0];
        for(int tmp: quantities){
            if(tmp > maxQuantity){
                maxQuantity = tmp;
            }
        }
        System.out.printf("Sách có số lượng nhiều nhất (%d):\n", maxQuantity);
        for(int i=0; i<names.length; i++){
            if(quantities[i] == maxQuantity){
                System.out.println("- "+names[i]);
            }
        }
        System.out.println("-----------------------");
    }

    static void minQuantityOfBooks(String[] names, int[] quantities){
        int minQuantity = quantities[0];
        for(int tmp: quantities){
            if(tmp < minQuantity){
                minQuantity = tmp;
            }
        }
        System.out.printf("Sách có số lượng ít nhất (%d):\n", minQuantity);
        for(int i=0; i<names.length; i++){
            if(quantities[i] == minQuantity){
                System.out.println("- "+names[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {
                "Dế Mèn Phiêu Lưu Ký",
                "Tuổi Thơ Dữ Dội",
                "Harry Potter",
                "Nhà Giả Kim",
                "Đắc Nhân Tâm"
        };
        int[] quantities = {5,3,10,7,4};

        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names,quantities);

    }
}
