package problems.splitwise.user;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private final List<User> users;

    public UserController() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUser(String userID) {

        for (User user : users) {
            if (user.getId().equals(userID)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }

}
