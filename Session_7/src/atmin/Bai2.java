package atmin;

public class Bai2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a= 20;

        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10

        Student st = new Student("Atmin");
//        Student st2 = st;
        st.setStuName("Admin");

        System.out.println("s1.name = " + st.getStuName());
//        System.out.println("s2.name = " + st2.getStuName());

    }
}
