package by.tms.dao;

import by.tms.entity.User;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {
    private final List<User> users = new ArrayList<>();
    private int count;

    public void add (User user) {
        user.setId(++count);
        users.add(user);
    }

    public User findUserByLogin(String login) {
        return users.stream().filter(user -> user.getLogin().equals(login)).findAny().orElse(null);
    }
}