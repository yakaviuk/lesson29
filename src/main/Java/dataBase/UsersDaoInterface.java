package dataBase;

import entity.User;

public interface UsersDaoInterface {
    User getUserById(long idUser);
    boolean deleteUserById(User user);
    boolean createUser(User user);
    boolean userUpdate (User user);
}
