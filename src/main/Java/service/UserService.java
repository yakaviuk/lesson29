package service;

import dataBase.UsersDaoInterface;
import dataBase.UsersDao;
import entity.User;

public class UserService implements Service {

    UsersDaoInterface dao;

    @Override
    public User getUserByIdService(long userId){
        dao = new UsersDao();
        return dao.getUserById(userId);
    }

    @Override
    public boolean deleteUserByIdService(User userEntity)  {
        dao = new UsersDao();
        return dao.deleteUserById(userEntity);
    }

    @Override
    public boolean createUser(User userEntity) {
        dao = new UsersDao();
        return dao.createUser(userEntity);
    }

    @Override
    public boolean userUpdate(User userEntity) {
        dao = new UsersDao();
        return dao.userUpdate(userEntity);
    }
}
