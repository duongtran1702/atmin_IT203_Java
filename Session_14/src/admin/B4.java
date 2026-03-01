package admin;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class B4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết"));
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key) + " ca");
        }

    }
}
