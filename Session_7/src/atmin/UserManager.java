package atmin;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    static List<User> users = new ArrayList<>();

    public static void addUser(User u) {
        users.add(u);
    }

    public static boolean checkLogin(String username, String password) {
        for (User u : users) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
