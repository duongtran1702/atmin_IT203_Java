package atmin;

import java.util.regex.Pattern;

public class User {
    static int idAuto = 1;
    private final Integer id;
    private final String username;
    private String password;
    private String email;

    final String regexEmail = "^[0-9a-zA-Z._]+@[a-z]{3,}\\.[a-z]+$";

    public User(String username, String password, String email) {
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Password must not be empty");
        }

        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email must not be empty");
        }

        if (!Pattern.matches(regexEmail, email)) {
            throw new IllegalArgumentException("Invalid Email");
        }

        this.id = idAuto++;
        this.username = username;
        this.password = password;
        this.email = email;
    }


    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Password must not be empty");
        }
        this.password = password;
    }

    public void setEmail(String email) {
        if (!Pattern.matches(regexEmail, email)) {
            throw new IllegalArgumentException("Invalid Email");
        }
        this.email = email;
    }

    public void showUser() {
        System.out.println("ID: " + this.id);
        System.out.println("Username: " + this.username);
        System.out.println("Email: " + this.email);
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        User u1 = new User("atmin", "123456", "atmin@gmail.com");
        u1.showUser();
        u1.setPassword("atmin123");
        u1.setEmail("atmin123@yahoo.com");
        u1.showUser();
        User u2 = new User("user3", "   ", "user3@gmail.com");
        User u3 = new User("user4", "123456", "user4gmail.com");
        User u5 = new User("user5", "123456", null);
    }
}
