package admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B6 {
    public static void main(String[] args) {
        Map<String, List<PatientVersion2>> map = new HashMap<>();

        List<PatientVersion2> list = new ArrayList<>();

        list.add(new PatientVersion2("Nguyễn Văn A", 25, "Emergency"));
        list.add(new PatientVersion2("Trần Thị B", 40, "Cardiology"));
        list.add(new PatientVersion2("Lê Văn C", 60, "Oncology"));
        list.add(new PatientVersion2("Phạm Thị D", 30, "Emergency"));
        list.add(new PatientVersion2("Hoàng Văn E", 55, "Cardiology"));

        for (PatientVersion2 p : list) {
            if (map.containsKey(p.department)) {
                map.get(p.department).add(p);
            } else {
                List<PatientVersion2> list1 = new ArrayList<>();
                list1.add(p);
                map.put(p.department, list1);
            }
        }

        String department = null;
        int num = 0;

        for (Map.Entry<String, List<PatientVersion2>> entry : map.entrySet()) {
            if (entry.getValue().size() > num) {
                department = entry.getKey();
                num = entry.getValue().size();
            }
        }
        System.out.printf("Khoa %s đông nhất (%d bệnh nhân)", department, num);
    }
}
