package atmin;

import java.util.*;

public class B2 {
    public static void filterDuplicate(List<String> list) {
        ListIterator<String> lit = list.listIterator();
        Set<String> temp = new HashSet<>();
        while (lit.hasNext()) {
            String next = lit.next();
            if (!temp.add(next)) {
                lit.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen"));
        filterDuplicate(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
