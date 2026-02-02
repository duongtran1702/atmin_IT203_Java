package atmin;

public class ClassRoom {
    static int classFund = 0;
    String studentName;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void payFund(int amount) {
        classFund += amount;
        System.out.println(studentName + " đã đóng " + amount + " VND");
    }

    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund + " VND");
    }


    public static void main(String[] args) {

        ClassRoom sv1 = new ClassRoom("An");
        ClassRoom sv2 = new ClassRoom("Bình");
        ClassRoom sv3 = new ClassRoom("Chi");

        sv1.payFund(10000);
        sv2.payFund(20000);
        sv3.payFund(15000);

        ClassRoom.showClassFund();
    }


}
