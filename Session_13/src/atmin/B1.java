package atmin;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class B1 {
    public static void main(String[] args) {
        List<Double> temperature = new ArrayList<>(List.of(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8));
        temperature.removeIf(temp -> temp < 34.0 || temp > 42.0);
        double average = temperature.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.println(average );
    }

}
