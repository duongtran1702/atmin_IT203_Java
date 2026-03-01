package admin;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class B5 {
    public static void main(String[] args) {
        Set<Patient> set = new TreeSet<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                if (o1.severity != o2.severity) {
                    return o1.severity - o2.severity;
                }
                return o1.arrivalTime - o2.arrivalTime;
            }
        });

        set.add(new Patient("Bệnh nhân A", 3, 800));
        set.add(new Patient("Bệnh nhân B", 1, 815));
        set.add(new Patient("Bệnh nhân C", 1, 805));

        System.out.println("Thứ tự xử lý:");
        for (Patient p : set) {
            System.out.println(p);
        }

    }
}
