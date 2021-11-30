package by.tms.dao;

import by.tms.entity.User;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {
    private final List<User> users = new ArrayList<>();
    private int count;

    public void add (String login, String password) {
        users.add(new User(++count, login, password));
    }

    public User findUserByLogin(String login) {
        return users.stream().filter(user -> user.getLogin().equals(login)).findAny().orElse(null);
    }
}