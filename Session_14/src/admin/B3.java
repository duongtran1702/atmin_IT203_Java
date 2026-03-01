package admin;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class B3 {
    public static void main(String[] args) {
        Set<String> A = new HashSet<>(List.of("Aspirin", "Caffeine", "Paracetamol"));
        Set<String> B = new HashSet<>(List.of("Penicillin", "Aspirin", "Pollen"));
        Set<String> C = new HashSet<>(B);
        C.retainAll(A);
        Set<String> D = new HashSet<>(B);
        D.removeAll(A);
        System.out.println("Canh cao di ung: " + C);
        System.out.println("Thanh phan an toan: " + D);
    }
}
