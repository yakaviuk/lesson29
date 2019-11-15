package service;

import entity.User;

public interface Service {
    User getUserByIdService(long userId);
    boolean deleteUserByIdService(User userEntity);
    boolean createUser(User userEntity);
    boolean userUpdate (User userEntity);
}
