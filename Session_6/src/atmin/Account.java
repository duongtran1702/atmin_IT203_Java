package atmin;

public class Account {
    private final String username;
    private String password;
    private final String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showInfor() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        Account acc = new Account("atmin", "123456", "atmin@gmail.com");
//        System.out.println(acc.getPassword());
        acc.setPassword("atmin123");
        acc.showInfor();
//        System.out.println(acc.getPassword());
    }
}
