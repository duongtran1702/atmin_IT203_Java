package admin;

import java.util.*;

public class B1 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(List.of("Nguyễn Văn A – Yên Bái", "Trần Thị B – Thái Bình", "Nguyễn Văn A – Yên Bái", "Lê Văn C – Hưng Yên"));
        for (String s : set) {
            System.out.println(s);
        }
    }
}
