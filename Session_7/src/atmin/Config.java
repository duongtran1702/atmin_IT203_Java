package atmin;

import java.util.Scanner;

public class Config {
    public static final int MAX_SCORE = 10;
    public static final int MIN_SCORE = 0;

    public static void main(String[] args) {

        int score;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        score = sc.nextInt();

        if (score > Config.MAX_SCORE) {
            System.out.println("Điểm vượt quá giới hạn!");
        } else if (score < Config.MIN_SCORE) {
            System.out.println("Điểm không hợp lệ!");
        } else {
            System.out.println("Điểm hợp lệ: " + score);
        }

//        Config.MAX_SCORE = 20;
    }
}
