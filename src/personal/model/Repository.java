package personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user, String reg);
    void UpdateUser(User user, Fields field, String param);
    void deleteUser (String id);
}
