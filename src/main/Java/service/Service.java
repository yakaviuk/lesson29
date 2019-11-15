package service;

import entity.User;

public interface Service {
    User getUserByIdService(long userId);
    boolean deleteUserByIdService(User user);
    boolean createUser(User user);
    boolean userUpdate (User user);
}
