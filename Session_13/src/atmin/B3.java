package atmin;

import java.util.ArrayList;
import java.util.List;

public class B3 {
    public static <T> List<T> findCommonPatients(List<T> A, List<T> B) {
        List<T> tmp = new ArrayList<>();

        for (T temp : A) {
            if (B.contains(temp)) {
                tmp.add(temp);
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(List.of(101, 102, 105));
        List<Integer> B = new ArrayList<>(List.of(102, 105, 108));

        List<Integer> result1 = findCommonPatients(A, B);
        System.out.println(result1);

        List<String> A2 = new ArrayList<>(List.of("DN01", "DN02", "DN03"));
        List<String> B2 = new ArrayList<>(List.of("DN02", "DN04"));

        List<String> common = findCommonPatients(A2, B2);
        System.out.println(common);


    }
}
