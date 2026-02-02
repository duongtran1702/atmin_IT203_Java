package atmin;

public class ScoreUtils {
    // Phương thức kiểm tra Đạt/Trượt
    public static boolean checkPass(double score) {
        return score < 5.0;
    }

    // Phương thức tính trung bình cộng
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static void main(String[] args) {
        double[] scores = {6.5, 8.0, 4.5};
        double average = ScoreUtils.calculateAverage(scores);
        boolean isPass = ScoreUtils.checkPass(average);
        if (isPass) {
            System.out.println("Đạt");
        } else {
            System.out.println("Trượt");
        }
    }
}