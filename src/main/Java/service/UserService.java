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
    public boolean deleteUserByIdService(User user)  {
        dao = new UsersDao();
        return dao.deleteUserById(user);
    }

    @Override
    public boolean createUser(User user) {
        dao = new UsersDao();
        return dao.createUser(user);
    }

    @Override
    public boolean userUpdate(User user) {
        dao = new UsersDao();
        return dao.userUpdate(user);
    }
}
