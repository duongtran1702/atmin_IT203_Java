package atmin;

public class Main {
    public static void main(String[] args) {

        // Thêm user vào hệ thống
        UserManager.addUser(new User(1, "dev_a", "123456"));
        UserManager.addUser(new User(2, "dev_b", "654321"));
        UserManager.addUser(new User(3, "dev_c", "abcdef"));

        System.out.println("Đã thêm 3 user vào hệ thống.");
        System.out.println("Danh sách hiện tại:\n");

        // In danh sách user
        for (User u : UserManager.users) {
            System.out.printf("User[id = %d, name = %s]\n",u.getId(),u.getUsername());
        }

        System.out.println("\nKiểm tra đăng nhập:\n");

        // Test login
        System.out.println(
                "Login (\"dev_a\", \"123456\"): " +
                        (UserManager.checkLogin("dev_a", "123456")
                                ? "Thành công!"
                                : "Thất bại!")
        );

        System.out.println(
                "Login (\"dev_b\", \"sai_pass\"): " +
                        (UserManager.checkLogin("dev_b", "sai_pass")
                                ? "Thành công!"
                                : "Thất bại!")
        );
    }
}

