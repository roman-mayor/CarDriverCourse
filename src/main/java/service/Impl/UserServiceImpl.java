package service.Impl;

import dao.UserDao;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.create(user);
    }

    @Override
    public User deleteUser(User user) {
        return userDao.delete(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getById(id);
    }
}
