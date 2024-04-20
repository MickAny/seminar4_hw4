package seminar4.hw4.repository;

import org.springframework.stereotype.Repository;
import seminar4.hw4.domain.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }
    public void addUser(User user){
        users.add(user);
    }
}
