package dataBase;

import entity.User;

public interface UsersDaoInterface {
    User getUserById(long id);
    boolean deleteUserById(User user);
    boolean createUser(User user);
    boolean userUpdate (User user);
}
